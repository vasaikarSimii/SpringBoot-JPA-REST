package com.restapp.shop.Service;

public interface PurchaseService {

    public void buyItem(Long customer_id, Long item_id, int quantity);
    
}
