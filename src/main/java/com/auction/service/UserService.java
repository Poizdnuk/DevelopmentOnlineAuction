package com.auction.service;


import com.auction.model.User;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findByUserLogin(String login);

    User getOne(Long id);


    List<User> findAll(Sort var1);

    User saveAndFlush(User user);

    void save(User user);


}
