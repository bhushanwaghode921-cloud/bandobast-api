package com.app.bandobastapi.model;


import jakarta.persistence.*;

@Entity
@Table(name = "rejectionTemplate")
public class RejectionTemplate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rejectionTemplateId;
    private String policeStationName;
    private String address;
    private String district;
    private String village;
    private String city;
    private String zipCode;
    private String landlineNumber;
    private String policeStationNumber;
    private String policeStationLandline;
    private String policeStationHQ;
    private String rejectionTitle;
    private String rejectionDescription;
    private String status;

    public int getRejectionTemplateId() {
        return rejectionTemplateId;
    }

    public void setRejectionTemplateId(int rejectionTemplateId) {
        this.rejectionTemplateId = rejectionTemplateId;
    }

    public String getPoliceStationName() {
        return policeStationName;
    }

    public void setPoliceStationName(String policeStationName) {
        this.policeStationName = policeStationName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getLandlineNumber() {
        return landlineNumber;
    }

    public void setLandlineNumber(String landlineNumber) {
        this.landlineNumber = landlineNumber;
    }

    public String getPoliceStationNumber() {
        return policeStationNumber;
    }

    public void setPoliceStationNumber(String policeStationNumber) {
        this.policeStationNumber = policeStationNumber;
    }

    public String getPoliceStationLandline() {
        return policeStationLandline;
    }

    public void setPoliceStationLandline(String policeStationLandline) {
        this.policeStationLandline = policeStationLandline;
    }

    public String getPoliceStationHQ() {
        return policeStationHQ;
    }

    public void setPoliceStationHQ(String policeStationHQ) {
        this.policeStationHQ = policeStationHQ;
    }

    public String getRejectionTitle() {
        return rejectionTitle;
    }

    public void setRejectionTitle(String rejectionTitle) {
        this.rejectionTitle = rejectionTitle;
    }

    public String getRejectionDescription() {
        return rejectionDescription;
    }

    public void setRejectionDescription(String rejectionDescription) {
        this.rejectionDescription = rejectionDescription;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "RejectionTemplate{" +
                "rejectionTemplateId=" + rejectionTemplateId +
                ", policeStationName='" + policeStationName + '\'' +
                ", address='" + address + '\'' +
                ", district='" + district + '\'' +
                ", village='" + village + '\'' +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", landlineNumber='" + landlineNumber + '\'' +
                ", policeStationNumber='" + policeStationNumber + '\'' +
                ", policeStationLandline='" + policeStationLandline + '\'' +
                ", policeStationHQ='" + policeStationHQ + '\'' +
                ", rejectionTitle='" + rejectionTitle + '\'' +
                ", rejectionDescription='" + rejectionDescription + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
