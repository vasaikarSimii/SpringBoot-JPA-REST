package com.restapp.shop.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customer_name;
    private String customer_email;
    private String customer_address;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCustomer_name() {
        return customer_name;
    }
    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }
    public String getCustomer_email() {
        return customer_email;
    }
    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }
    public String getCustomer_address() {
        return customer_address;
    }
    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }
    public Customer() {
    }
    public Customer(Long id, String customer_name, String customer_email, String customer_address) {
        this.id = id;
        this.customer_name = customer_name;
        this.customer_email = customer_email;
        this.customer_address = customer_address;
    }
    @Override
    public String toString() {
        return "Customer [id=" + id + ", customer_name=" + customer_name + ", customer_email=" + customer_email
                + ", customer_address=" + customer_address + "]";
    }
       
}
