package com.project.Wastelessharvest.Service.Impl;

import com.project.Wastelessharvest.Dto.CustomerDTO;
import com.project.Wastelessharvest.Entity.Customer;
import com.project.Wastelessharvest.Repositery.CustomerRepo;
import com.project.Wastelessharvest.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

public class CustomerIMPL implements CustomerService {
    @Autowired
    private CustomerRepo customerRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String addCustomer(CustomerDTO customerDTO) {
        Customer customer = new Customer(
                customerDTO.getCustomerId(),
                customerDTO.getCustomerName(),
                customerDTO.getEmail(),
                customerDTO.getPhoneNo1(),
                customerDTO.getPhoneNo2(),
                customerDTO.getAddress(),
                customerDTO.getPinNo(),
                customerDTO.getOrganizationName(),
                this.passwordEncoder.encode(customerDTO.getPassword())
        );
        customerRepo.save(customer);
        return customer.getCustomerName();
    }
}
