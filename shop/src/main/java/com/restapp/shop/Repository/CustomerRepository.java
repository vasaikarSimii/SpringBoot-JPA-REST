package com.restapp.shop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapp.shop.Entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>{
    
}
