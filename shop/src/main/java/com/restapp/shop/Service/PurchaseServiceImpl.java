package com.restapp.shop.Service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapp.shop.Entity.Customer;
import com.restapp.shop.Entity.Item;
import com.restapp.shop.Entity.Purchase;
import com.restapp.shop.Repository.CustomerRepository;
import com.restapp.shop.Repository.ItemRepository;
import com.restapp.shop.Repository.PurchaseRepository;

@Service
public class PurchaseServiceImpl implements PurchaseService{

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private PurchaseRepository purchaseRepository;

    @Override
    public void buyItem(Long customer_id, Long item_id, int quantity) {
        Customer customer = customerRepository.findById(customer_id).orElseThrow();
        Item item = itemRepository.findById(item_id).orElseThrow();

        //Check if item quantity is sufficient
        if(item.getItem_quantity()< quantity){
            try {
                throw new Exception("Not Enough Items Left");
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        //calculate total price
        double total_price = item.getItem_price() * quantity;

        item.setItem_quantity(item.getItem_quantity()-quantity);
        itemRepository.save(item);


        // Record purchase history
        Purchase purchase = new Purchase();
        purchase.setCustomer(customer);
        purchase.setItem(item);
        purchase.setQuantity(quantity);
        purchase.setTotalPrice(total_price);
        purchase.setPurchaseDate(LocalDateTime.now());
        purchaseRepository.save(purchase);
        
    }
    
}
