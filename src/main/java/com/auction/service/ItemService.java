package com.auction.service;


import com.auction.model.Item;

import java.util.List;

public interface ItemService {
    Item addItem(Item item);
    void delete(Long id);
    Item getByItem(Long id);
    Item editBank(Item item);
    List<Item> getAll();
}
