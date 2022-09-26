package com.example.webservice.repository;

import com.example.webservice.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICustomerRepository  extends PagingAndSortingRepository<Customer, Long> {
}
