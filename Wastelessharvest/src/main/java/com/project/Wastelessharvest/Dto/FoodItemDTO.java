package com.project.Wastelessharvest.Dto;
import com.project.Wastelessharvest.Entity.Customer;

import java.time.LocalDate;


public class FoodItemDTO {

    private int foodId;
    private Customer customer;
    private String foodName;
    private String foodType;
    private String foodQuantity;
    private String pickupLocation;
    private double contactNo;
    private LocalDate expiryDate;

    public FoodItemDTO() {
    }

    public FoodItemDTO(int foodId, Customer customer ,String foodName, String foodType, String foodQuantity, String pickupLocation, double contactNo, LocalDate expiryDate) {
        this.foodId = foodId;
        this.customer=customer;
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
        return "FoodItemDTO{" +
                "foodId=" + foodId +
                ", foodName='" + foodName + '\'' +
                ", foodType='" + foodType + '\'' +
                ", foodQuantity='" + foodQuantity + '\'' +
                ", pickupLocation='" + pickupLocation + '\'' +
                ", contactNo=" + contactNo +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
