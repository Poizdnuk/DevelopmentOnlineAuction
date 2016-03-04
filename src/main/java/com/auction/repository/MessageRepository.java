package com.auction.repository;


import com.auction.model.Bid;
import com.auction.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("messageRepository")
public interface MessageRepository extends JpaRepository<Message,Long> {
}

