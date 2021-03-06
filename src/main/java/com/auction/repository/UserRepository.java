package com.auction.repository;

import com.auction.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {

    User findByLogin(String login);

//    @Query("select u from User u where u.user_first_name = :name or u.user_last_name = :name")
//    List<User> findByFirstnameOrLastname(String name);
//
//    @Query("select u from User u where u.firstname = :#{#user.firstname} or u.lastname = :#{#user.lastname}")
//    Iterable<User> findByFirstnameOrLastname(User user);
//    Optional<User> findByUsername(Optional<String> username);
}