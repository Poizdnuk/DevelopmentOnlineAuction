package com.auction.repository;

import com.auction.model.Category;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("categoryRepository")
public interface CategoryRepository extends JpaRepository<Category,Long> {

    Category getOne(Long id);
    List<Category> findAll();
    List<Category> findAll(Sort var1);
    Category saveAndFlush(Category category);

}