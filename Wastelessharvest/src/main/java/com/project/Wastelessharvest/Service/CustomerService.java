package com.project.Wastelessharvest.Service;

import com.project.Wastelessharvest.Dto.CustomerDTO;
import com.project.Wastelessharvest.Dto.LoginDTO;
import com.project.Wastelessharvest.Entity.Customer;
import com.project.Wastelessharvest.Response.LoginResponse;

import java.util.List;

public interface CustomerService {


    String addCustomer(CustomerDTO customerDTO);


    LoginResponse loginCustomer(LoginDTO loginDTO);

    Customer getCustomerById(int customerId);
}
