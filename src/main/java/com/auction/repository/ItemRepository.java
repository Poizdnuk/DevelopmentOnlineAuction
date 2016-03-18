package com.auction.repository;

import com.auction.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository("itemRepository")
public interface ItemRepository extends JpaRepository<Item,Long> {

    @Query("select u from Item u where u.name=:name")
    Item findItemByName(@Param("name") String name);
}

