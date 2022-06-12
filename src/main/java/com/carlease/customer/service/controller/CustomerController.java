package com.carlease.customer.service.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carlease.customer.service.VO.ResponseTemplateVO;
import com.carlease.customer.service.entity.Customer;
import com.carlease.customer.service.service.CustomerService;
import com.sun.istack.internal.NotNull;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/v1/customers")
public class CustomerController {

  @Autowired
  private CustomerService customerService;

  @GetMapping("/")
  public List<Customer> getAllCustomers() {
    return customerService.findAllCustomers();
  }

  @PostMapping("/")
  public Customer saveCustomer(@Valid @NotNull @RequestBody Customer customer) {
    log.info("Inside saveCustomer method of CustomerController");
    return customerService.saveCustomer(customer);
  }

  @GetMapping("/{id}")
  public Customer findCustomerById(@PathVariable("id") Long customerId) {
    log.info("Inside findCustomerById method of CustomerController");
    return customerService.findCustomerById(customerId);
  }

  public ResponseTemplateVO getCustomerWithCarData(Long customerId) {
    return customerService.getCustomerWithCarDetails(customerId);
  }
}
