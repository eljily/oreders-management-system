package com.sidibrahim.oms.service;

import com.sidibrahim.oms.entity.Item;
import com.sidibrahim.oms.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemService {
    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }
    public Item save(Item item){
        return itemRepository.save(item);
    }
    public Item findById(Integer id){
        return itemRepository.findById(id).orElse(null);
    }
    public List<Item> findAll(){
        return itemRepository.findAll();
    }
    public void deleteById(Integer id){
        itemRepository.deleteById(id);
    }
}
