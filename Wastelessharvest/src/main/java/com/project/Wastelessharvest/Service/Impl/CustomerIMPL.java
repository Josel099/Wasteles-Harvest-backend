package com.project.Wastelessharvest.Service.Impl;

import com.project.Wastelessharvest.Dto.CustomerDTO;
import com.project.Wastelessharvest.Dto.LoginDTO;
import com.project.Wastelessharvest.Entity.Customer;
import com.project.Wastelessharvest.Repositery.CustomerRepo;
import com.project.Wastelessharvest.Response.LoginResponse;
import com.project.Wastelessharvest.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
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


    @Override
    public Customer getCustomerById(int customerId) {
        return customerRepo.findByCustomerId(customerId);
    }

    @Override
    public LoginResponse loginCustomer(LoginDTO loginDTO) {

        String msg = "";
        Customer customer1 = customerRepo.findByEmail(loginDTO.getEmail());
        if (customer1 != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = customer1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<Customer> customer = customerRepo.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
                if (customer.isPresent()) {
                    int customer_id = customer1.getCustomerId();
                    return new LoginResponse("Login Success", true ,customer_id);
                } else {
                    return new LoginResponse("Login Failed", false,0);
                }
            } else {

                return new LoginResponse("password Not Match", false,0);
            }
        }else {
            return new LoginResponse("Email not exists", false,0);
        }



    }


}
