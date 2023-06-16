package com.project.Wastelessharvest.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "customer_info")
public class Customer {

    @Id
    @Column(name = "customerId" , length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerId;
    @Column(name = "customerName", length=200)
    private String customerName;
    @Column(name = "email",length=200)
    private String email;
    @Column(name = "phoneNo1",length = 12)
    private double phoneNo1;
    @Column(name = "phoneNo2",length = 12)
    private double phoneNo2;
    @Column(name = "address" , length = 300)
    private String address;
    @Column(name = "pinNo" , length = 20)
    private int pinNo;
    @Column(name = "organizationName", length = 100)
    private String organizationName;
    @Column(name = "password",length=200)
    private String password;

    public Customer() {
    }

    public Customer(int customerId, String customerName, String email, double phoneNo1, double phoneNo2, String address, int pinNo, String organizationName, String password) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.email = email;
        this.phoneNo1 = phoneNo1;
        this.phoneNo2 = phoneNo2;
        this.address = address;
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

    public double getPhoneNo1() {
        return phoneNo1;
    }

    public void setPhoneNo1(double phoneNo1) {
        this.phoneNo1 = phoneNo1;
    }

    public double getPhoneNo2() {
        return phoneNo2;
    }

    public void setPhoneNo2(double phoneNo2) {
        this.phoneNo2 = phoneNo2;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
        return "Customer{" +
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
