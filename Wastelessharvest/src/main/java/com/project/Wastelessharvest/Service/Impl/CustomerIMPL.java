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
    public LoginResponse loginCustomer(LoginDTO loginDTO) {

        String msg = "";
        Customer customer1 = customerRepo.findByEmail(loginDTO.getEmail());
        if (customer1 != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = customer1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<Employee> employee = employeeRepo.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
                if (employee.isPresent()) {
                    return new LoginResponse("Login Success", true);
                } else {
                    return new LoginResponse("Login Failed", false);
                }
            } else {

                return new LoginResponse("password Not Match", false);
            }
        }else {
            return new LoginResponse("Email not exists", false);
        }



    }
}
