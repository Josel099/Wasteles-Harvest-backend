package com.project.Wastelessharvest.Service.Impl;

import com.project.Wastelessharvest.Dto.CustomerDTO;
import com.project.Wastelessharvest.Dto.LoginDTO;
import com.project.Wastelessharvest.Entity.Customer;
import com.project.Wastelessharvest.Repositery.CustomerRepo;
import com.project.Wastelessharvest.Response.LoginResponse;
import com.project.Wastelessharvest.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Customer getCustomerById(int customerId) {
        Customer customer= customerRepo.findByCustomerId(customerId);
                return customer;
        }

    @Override
    public void updateCustomer(int customerId, CustomerDTO customerDTO) {

        Customer customerUpdated = customerRepo.findByCustomerId(customerId);

                customerUpdated.setCustomerName(customerDTO.getCustomerName());
                customerUpdated.setPhoneNo1(customerDTO.getPhoneNo1());
                customerUpdated.setPhoneNo2(customerDTO.getPhoneNo2());
                customerUpdated.setAddress(customerDTO.getAddress());
                customerUpdated.setPinNo(customerDTO.getPinNo());
                customerUpdated.setOrganizationName(customerDTO.getOrganizationName());
                String password = customerDTO.getPassword();
        if (password != null && !password.isEmpty()) {
            customerUpdated.setPassword(this.passwordEncoder.encode(password));
        }
                customerRepo.save(customerUpdated);
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
