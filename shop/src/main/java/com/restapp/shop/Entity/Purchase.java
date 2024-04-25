package com.restapp.shop.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name= "customer_id")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name= "item_id")
    private Item item;
    private int quantity;
    private double totalPrice;
    private LocalDateTime purchaseDate;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Item getItem() {
        return item;
    }
    public void setItem(Item item) {
        this.item = item;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    public LocalDateTime getPurchaseDate() {
        return purchaseDate;
    }
    public void setPurchaseDate(LocalDateTime purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
    public Purchase(Long id, Customer customer, Item item, int quantity, double totalPrice,
            LocalDateTime purchaseDate) {
        this.id = id;
        this.customer = customer;
        this.item = item;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.purchaseDate = purchaseDate;
    }
    public Purchase() {
    }
    @Override
    public String toString() {
        return "Purchase [id=" + id + ", customer=" + customer + ", item=" + item + ", quantity=" + quantity
                + ", totalPrice=" + totalPrice + ", purchaseDate=" + purchaseDate + "]";
    }
    

    
}
