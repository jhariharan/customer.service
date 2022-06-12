package com.carlease.customer.service.VO;

import com.carlease.customer.service.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

  private Customer customer;
  private Car car;

}
