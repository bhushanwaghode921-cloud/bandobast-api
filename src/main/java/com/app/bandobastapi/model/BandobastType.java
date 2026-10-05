package com.app.bandobastapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "bandobastType")
public class BandobastType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String bandobastTitle;
    private String status;

    @Override
    public String toString() {
        return "BandobastType{" +
                "id=" + id +
                ", bandobastTitle='" + bandobastTitle + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBandobastTitle() {
        return bandobastTitle;
    }

    public void setBandobastTitle(String bandobastTitle) {
        this.bandobastTitle = bandobastTitle;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
