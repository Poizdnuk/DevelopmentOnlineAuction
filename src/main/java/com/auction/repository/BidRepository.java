package com.auction.repository;


import com.auction.model.Bid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("bidRepository")
public interface BidRepository extends JpaRepository<Bid,Long> {
}

