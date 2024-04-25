package com.restapp.shop.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapp.shop.Entity.Item;
import com.restapp.shop.Service.ItemService;




@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/items")
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    @GetMapping("/items/{id}")
    public Item getItemByID(@PathVariable Long id) {
        return itemService.getItemByID(id);
    }

    @PostMapping("/items")
    public Item addNewItem(@RequestBody Item item) {
        return itemService.addNewItem(item);
    }
    
    
}
