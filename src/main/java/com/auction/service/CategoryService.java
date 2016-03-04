package com.auction.service;


import com.auction.model.Category;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface CategoryService {

    Category getOne(Long id);
    List<Category> findAll();
    List<Category> findAll(Sort var1);
    Category saveAndFlush(Category category);
}
