package com.auction.service;

import com.auction.model.History;

import java.util.List;

public interface HistoryService {
    History addHistory(History history);
    void delete(Long id);
    History getByHistory(Long id);
    List<History> getAll();
}
