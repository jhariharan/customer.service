package com.carlease.customer.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.carlease.customer.service.VO.Car;
import com.carlease.customer.service.VO.ResponseTemplateVO;
import com.carlease.customer.service.entity.Customer;
import com.carlease.customer.service.repository.CustomerRepository;

@Service
public class CustomerService {

  @Autowired
  private CustomerRepository customerRepository;

  @Autowired
  private RestTemplate restTemplate;

  public Customer saveCustomer(final Customer customer) {
    return customerRepository.save(customer);
  }

  public Customer findCustomerById(final Long customerId) {
    return customerRepository.findById(customerId).get();
  }

  public List<Customer> findAllCustomers() {
    return customerRepository.findAll();
  }

  public ResponseTemplateVO getCustomerWithCarDetails(final Long customerId) {
    ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
    Customer customer = findCustomerById(customerId);
    Car car = restTemplate.getForObject("http://localhost:9002/api/v1/cars/" + customer.getCarId(), Car.class);
    responseTemplateVO.setCar(car);
    responseTemplateVO.setCustomer(customer);
    return responseTemplateVO;
  }
}
