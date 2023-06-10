package com.project.Wastelessharvest.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
@CrossOrigin
public class CustomerController {

    @PostMapping(path = "/save")
    public String saveCustomer(@RequestBody CustomerDTO customerDTO){
        String Id = customerService.addEmployee(customerDTO);
        return Id;
    }


}
