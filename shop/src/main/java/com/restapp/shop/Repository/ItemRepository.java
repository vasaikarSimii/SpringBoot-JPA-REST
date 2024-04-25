package com.restapp.shop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapp.shop.Entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item,Long>{
    
}
