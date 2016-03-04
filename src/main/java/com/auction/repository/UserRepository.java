package com.auction.repository;

import com.auction.model.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User,Long> {

    User getOne(Long id);
    List<User> findAll();
    List<User> findAll(Sort var1);
    User saveAndFlush(User user);

}