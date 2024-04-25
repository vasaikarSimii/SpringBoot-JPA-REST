package com.restapp.shop.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String item_name;
    private String item_info;
    private double item_price;
    private int item_quantity;
    private Long seller_id;
    
    @Override
    public String toString() {
        return "Item [id=" + id + ", item_name=" + item_name + ", item_info=" + item_info + ", item_price=" + item_price
                + ", item_quantity=" + item_quantity + ", seller_id=" + seller_id + "]";
    }
    public Item(Long id, String item_name, String item_info, double item_price, int item_quantity, Long seller_id) {
        this.id = id;
        this.item_name = item_name;
        this.item_info = item_info;
        this.item_price = item_price;
        this.item_quantity = item_quantity;
        this.seller_id = seller_id;
    }
    public Item() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getItem_name() {
        return item_name;
    }
    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }
    public String getItem_info() {
        return item_info;
    }
    public void setItem_info(String item_info) {
        this.item_info = item_info;
    }
    public double getItem_price() {
        return item_price;
    }
    public void setItem_price(double item_price) {
        this.item_price = item_price;
    }
    public int getItem_quantity() {
        return item_quantity;
    }
    public void setItem_quantity(int item_quantity) {
        this.item_quantity = item_quantity;
    }
    public Long getSeller_id() {
        return seller_id;
    }
    public void setSeller_id(Long seller_id) {
        this.seller_id = seller_id;
    } 
}
