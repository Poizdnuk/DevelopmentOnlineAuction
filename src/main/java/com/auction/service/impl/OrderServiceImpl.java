package com.auction.service.impl;

import com.auction.model.Order;
import com.auction.repository.OrderRepository;
import com.auction.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order getOne(Long id) {
        return orderRepository.getOne(id);
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public List<Order> findAll(Sort var1) {
        return orderRepository.findAll(var1);
    }

    @Override
    public Order saveAndFlush(Order order) {
        return orderRepository.saveAndFlush(order);
    }
}
