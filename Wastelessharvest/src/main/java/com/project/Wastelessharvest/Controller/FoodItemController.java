package com.project.Wastelessharvest.Controller;

import com.project.Wastelessharvest.Dto.FoodItemDTO;
import com.project.Wastelessharvest.Entity.FoodItem;
import com.project.Wastelessharvest.Service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/foodItem")
@CrossOrigin
public class FoodItemController {
    @Autowired
    private FoodItemService foodItemService;

    @PostMapping(path = "/donateFood")
    public String  saveFoodItem( @RequestBody FoodItemDTO foodItemDTO){
        String result =foodItemService.addFood(foodItemDTO);
        return result;
    }
    @GetMapping(path = "/getFood")
    public List<FoodItem> getFoodItem(){
        return  foodItemService.getAllFoodItem();
    };

}
