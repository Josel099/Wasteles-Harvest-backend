package com.project.Wastelessharvest.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "foodItem")
public class FoodItem {

    @Id
    @Column(name = "foodId" , length = 25)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int foodId;
    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;
    @Column(name = "foodName", nullable = false )
    private String foodName;
    @Column(name = "foodType")
    private String foodType;

    @Column(name = "foodQuantity" ,nullable = false)
    private String foodQuantity;

    @Column(name = "pickupLocation", nullable = false)
    private String pickupLocation;
    @Column(name = "contactNo" , nullable = false)
    private double contactNo;

    @Column(name = "expiryDate")
    private LocalDate expiryDate;

    public FoodItem() {
    }

    public FoodItem(int foodId,Customer customer, String foodName, String foodType, String foodQuantity, String pickupLocation, double contactNo, LocalDate expiryDate) {
        this.foodId = foodId;
        this.customer = customer;
        this.foodName = foodName;
        this.foodType = foodType;
        this.foodQuantity = foodQuantity;
        this.pickupLocation = pickupLocation;
        this.contactNo = contactNo;
        this.expiryDate = expiryDate;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getFoodQuantity() {
        return foodQuantity;
    }

    public void setFoodQuantity(String foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public double getContactNo() {
        return contactNo;
    }

    public void setContactNo(double contactNo) {
        this.contactNo = contactNo;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "foodId=" + foodId +
                ", customer=" + customer +
                ", foodName='" + foodName + '\'' +
                ", foodType='" + foodType + '\'' +
                ", foodQuantity='" + foodQuantity + '\'' +
                ", pickupLocation='" + pickupLocation + '\'' +
                ", contactNo=" + contactNo +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
