package com.klef.fsd.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klef.fsd.springboot.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
