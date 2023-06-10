package com.project.Wastelessharvest.Service.Impl;

import com.project.Wastelessharvest.Dto.CustomerDTO;
import com.project.Wastelessharvest.Repositery.CustomerRepo;
import com.project.Wastelessharvest.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerIMPL implements CustomerService {
    @Autowired
    private CustomerRepo customerRepo;
    @Override
    public String addCustomer(CustomerDTO customerDTO) {
        return null;
    }
}
