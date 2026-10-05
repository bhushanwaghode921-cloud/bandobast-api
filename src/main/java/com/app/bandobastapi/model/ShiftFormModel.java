package com.app.bandobastapi.model;

import jakarta.persistence.*;

import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "shift")
public class ShiftFormModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private LocalTime shiftTime;
    private LocalTime inTime;
    private LocalTime outTime;
    private String shiftType;
    private String is_one_day_after_24hr_shift;
    private String status;

    @Override
    public String toString() {
        return "ShiftFormModel{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", shiftTime=" + shiftTime +
                ", inTime=" + inTime +
                ", outTime=" + outTime +
                ", shiftType='" + shiftType + '\'' +
                ", is_one_day_after_24hr_shift='" + is_one_day_after_24hr_shift + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalTime getShiftTime() {
        return shiftTime;
    }

    public void setShiftTime(LocalTime shiftTime) {
        this.shiftTime = shiftTime;
    }

    public LocalTime getInTime() {
        return inTime;
    }

    public void setInTime(LocalTime inTime) {
        this.inTime = inTime;
    }

    public LocalTime getOutTime() {
        return outTime;
    }

    public void setOutTime(LocalTime outTime) {
        this.outTime = outTime;
    }

    public String getShiftType() {
        return shiftType;
    }

    public void setShiftType(String shiftType) {
        this.shiftType = shiftType;
    }

    public String getIs_one_day_after_24hr_shift() {
        return is_one_day_after_24hr_shift;
    }

    public void setIs_one_day_after_24hr_shift(String is_one_day_after_24hr_shift) {
        this.is_one_day_after_24hr_shift = is_one_day_after_24hr_shift;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
