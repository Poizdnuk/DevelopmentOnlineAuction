package com.auction.service.impl;

import com.auction.model.Category;
import com.auction.repository.CategoryRepository;
import com.auction.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category getOne(Long id) {
        return categoryRepository.getOne(id);
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public List<Category> findAll(Sort var1) {
        return categoryRepository.findAll();
    }

    @Override
    public Category saveAndFlush(Category category) {
        return categoryRepository.saveAndFlush(category);
    }
}
