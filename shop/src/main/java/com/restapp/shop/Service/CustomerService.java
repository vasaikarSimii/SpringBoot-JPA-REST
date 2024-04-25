package com.restapp.shop.Service;

import java.util.List;

import com.restapp.shop.Entity.Customer;

public interface CustomerService {
    public List<Customer> getAllCustomers();
    public Customer getCustomerByID(Long id);
    public Customer addNewCustomer(Customer customer);
    
}
