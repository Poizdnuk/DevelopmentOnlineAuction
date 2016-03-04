package com.auction.service.impl;

import com.auction.model.Bid;
import com.auction.repository.BidRepository;
import com.auction.service.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bidService")
public class BidServiceImpl implements BidService {

    @Autowired
    BidRepository bidRepository;

    @Override
    public Bid addBid(Bid bid) {
        return bidRepository.save(bid);
    }

    @Override
    public void delete(Long id) {
        bidRepository.delete(id);
    }

    @Override
    public Bid getByBid(Long id) {
        return bidRepository.getOne(id);
    }

    @Override
    public List<Bid> getAll() {
        return bidRepository.findAll();
    }
}
