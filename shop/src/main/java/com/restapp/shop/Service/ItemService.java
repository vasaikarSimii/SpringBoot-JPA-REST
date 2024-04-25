package com.restapp.shop.Service;

import java.util.List;

import com.restapp.shop.Entity.Item;

public interface ItemService {

    public List<Item> getAllItems();
    public Item getItemByID(Long id);
    public Item addNewItem(Item item);

    
}
