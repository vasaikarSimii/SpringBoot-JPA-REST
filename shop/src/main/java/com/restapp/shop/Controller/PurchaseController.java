package com.restapp.shop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restapp.shop.Service.PurchaseService;


@RestController
public class PurchaseController {
    @Autowired
    private PurchaseService purchaseService;

    @PostMapping("/buy")
    public ResponseEntity<String> buyItem(@RequestParam Long customer_id, @RequestParam Long item_id, @RequestParam int quantity) {
        purchaseService.buyItem(customer_id, item_id, quantity);
        return ResponseEntity.ok("Item purchased Successfully!");
    }
    
    
}
