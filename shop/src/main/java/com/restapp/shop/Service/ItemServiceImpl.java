package com.restapp.shop.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapp.shop.Entity.Item;
import com.restapp.shop.Repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
        
    }

    @Override
    public Item getItemByID(Long id) {
        return itemRepository.findById(id).orElseThrow();
    }

    @Override
    public Item addNewItem(Item item) {
        return itemRepository.save(item);
    }
    
}
