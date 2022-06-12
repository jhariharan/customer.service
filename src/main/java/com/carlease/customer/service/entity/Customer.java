package com.carlease.customer.service.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long customerId;
  private String customerName;
  private String houseNumber;
  private String zipCode;
  private String city;
  private String emailAddress;
  private String mobileNumber;
  private Long carId;
}
