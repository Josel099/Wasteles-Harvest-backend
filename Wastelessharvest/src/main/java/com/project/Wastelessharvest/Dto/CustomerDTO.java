package com.project.Wastelessharvest.Dto;

import jakarta.persistence.Column;

public class CustomerDTO {
    private int customerId;
    private String customerName;
    private String email;
    private int phoneNo1;
    private int phoneNo2;
    private String address;
    private int pinNo;
    private String organizationName;
    private String password;

    public CustomerDTO() {
    }

    public CustomerDTO(int customerId, String customerName, String email, int phoneNo1, int phoneNo2,String address, int pinNo, String organizationName, String password) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.email = email;
        this.phoneNo1 = phoneNo1;
        this.phoneNo2 = phoneNo2;
        this.address= address;
        this.pinNo = pinNo;
        this.organizationName = organizationName;
        this.password = password;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNo1() {
        return phoneNo1;
    }

    public void setPhoneNo1(int phoneNo1) {
        this.phoneNo1 = phoneNo1;
    }

    public int getPhoneNo2() {
        return phoneNo2;
    }

    public void setPhoneNo2(int phoneNo2) {
        this.phoneNo2 = phoneNo2;
    }
    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address=address;
    }

    public int getPinNo() {
        return pinNo;
    }

    public void setPinNo(int pinNo) {
        this.pinNo = pinNo;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo1=" + phoneNo1 +
                ", phoneNo2=" + phoneNo2 +
                ", address='" + address + '\'' +
                ", pinNo=" + pinNo +
                ", organizationName='" + organizationName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
