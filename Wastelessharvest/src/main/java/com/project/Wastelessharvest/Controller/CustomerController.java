package com.project.Wastelessharvest.Controller;
import com.project.Wastelessharvest.Dto.CustomerDTO;
import com.project.Wastelessharvest.Dto.LoginDTO;
import com.project.Wastelessharvest.Entity.Customer;
import com.project.Wastelessharvest.Response.LoginResponse;
import com.project.Wastelessharvest.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    @PostMapping(path = "/login")
    public ResponseEntity<?> loginCustomer(@RequestBody LoginDTO loginDTO){
        LoginResponse loginResponse =customerService.loginCustomer(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }
    @GetMapping(path = "/getCustomer/{customerId}")
    public Customer getCustomerByCustomerId(@PathVariable int customerId) {
        return customerService.getCustomerById(customerId);
    }
}
