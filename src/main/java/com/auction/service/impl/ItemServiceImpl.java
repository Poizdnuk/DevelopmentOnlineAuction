package com.auction.service.impl;

import com.auction.model.Item;
import com.auction.repository.ItemRepository;
import com.auction.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("itemService")
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Item addItem(Item item) {
        return itemRepository.saveAndFlush(item);
    }

    @Override
    public void delete(Long id) {
        itemRepository.delete(id);
    }

    @Override
    public Item getByItem(Long id) {
        return itemRepository.getOne(id);
    }

    @Override
    public Item editItem(Item item) {
        return null;
    }

    @Override
    public List<Item> getAll() {
        return itemRepository.findAll();
    }

}
