package com.project.Wastelessharvest.Service.Impl;

import com.project.Wastelessharvest.Dto.FoodItemDTO;
import com.project.Wastelessharvest.Entity.FoodItem;
import com.project.Wastelessharvest.Repositery.FoodItemRepo;
import com.project.Wastelessharvest.Service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodItemIMPL implements FoodItemService {
    @Autowired
    private FoodItemRepo foodItemRepo;
    @Override
    public String addFood(FoodItemDTO foodItemDTO) {

        FoodItem foodItem = new FoodItem(
                foodItemDTO.getFoodId(),
                foodItemDTO.getCustomer(),
                foodItemDTO.getFoodName(),
                foodItemDTO.getFoodType(),
                foodItemDTO.getFoodQuantity(),
                foodItemDTO.getPickupLocation(),
                foodItemDTO.getContactNo(),
                foodItemDTO.getExpiryDate()
        );
        foodItemRepo.save(foodItem);
        return foodItem.getFoodName();
    }

    @Override
    public List<FoodItem> getAllFoodItem() {
        return foodItemRepo.findAll(Sort.by(Sort.Direction.DESC,"foodId"));

    }

    @Override
    public List<FoodItem> getFoodItembyCustomerId(int customerId) {
        return foodItemRepo.findByCustomerCustomerId(customerId);
    }
}

