package com.project.Wastelessharvest.Service;

import com.project.Wastelessharvest.Dto.FoodItemDTO;
import com.project.Wastelessharvest.Entity.FoodItem;

import java.util.List;

public interface FoodItemService {

    String addFood(FoodItemDTO foodItemDTO);
    List<FoodItem> getAllFoodItem();

    List<FoodItem> getFoodItembyCustomerId(int customerId);

     public  void deleteFoodItem(int foodId) ;
}
