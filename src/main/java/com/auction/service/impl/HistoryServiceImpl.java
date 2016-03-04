package com.auction.service.impl;

import com.auction.model.History;
import com.auction.repository.HistoryRepository;
import com.auction.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("historyService")
public class HistoryServiceImpl implements HistoryService {

    @Autowired
    private HistoryRepository historyRepository;

    @Override
    public History addHistory(History history) {
        return historyRepository.save(history);
    }

    @Override
    public void delete(Long id) {
        historyRepository.delete(id);
    }

    @Override
    public History getByHistory(Long id) {
        return historyRepository.getOne(id);
    }

    @Override
    public List<History> getAll() {
        return historyRepository.findAll();
    }
}
