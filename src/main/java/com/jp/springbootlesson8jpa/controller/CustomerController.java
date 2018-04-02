package com.jp.springbootlesson8jpa.controller;

import com.jp.springbootlesson8jpa.entity.Customer;
import com.jp.springbootlesson8jpa.repository.CustomerRepository;
import com.jp.springbootlesson8jpa.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 张俊鹏 on 3/23/2018
 */
@RestController
@RequestMapping("customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("all")
    public List<Customer> loadCustomers(){
        return customerRepository.findAll();
    }

    @GetMapping("get/{id}")
    public Customer getCustomer(@PathVariable("id")Long id){
        return customerRepository.getOne( id );
    }

    @PostMapping("add")
    public Customer addCustomer(@RequestBody Customer customer){
        customerService.addCustomer( customer );

        Long id = customer.getId();

        return customerService.getCustomerById( id );
    }
}
