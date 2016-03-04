package com.auction.repository;


import com.auction.model.History;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("historyRepository")
public interface HistoryRepository extends JpaRepository<History,Long> {
}

