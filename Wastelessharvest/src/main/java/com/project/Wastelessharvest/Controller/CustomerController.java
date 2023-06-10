package com.project.Wastelessharvest.Controller;

import com.project.Wastelessharvest.Dto.CustomerDTO;
import com.project.Wastelessharvest.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
@CrossOrigin
public class CustomerController {
    @Autowired
    public CustomerService customerService;

    @PostMapping(path = "/save")
    public String saveCustomer(@RequestBody CustomerDTO customerDTO){
        String Id = customerService.addCustomer(customerDTO);
        return Id;
    }


}
