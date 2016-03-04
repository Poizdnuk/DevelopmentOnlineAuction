package com.auction.service;

import com.auction.model.Bid;
import java.util.List;

public interface BidService {
    Bid addBid(Bid bid);
    void delete(Long id);
    Bid getByBid(Long id);
    List<Bid> getAll();
}
