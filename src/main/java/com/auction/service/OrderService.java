package com.auction.service;


import com.auction.model.Order;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface OrderService {
    Order getOne(Long id);

    List<Order> findAll();

    List<Order> findAll(Sort var1);

    Order saveAndFlush(Order order);
}
