package com.auction.service;

import com.auction.model.Message;

import java.util.List;

public interface MessageService {
    Message addMessage(Message message);
    void delete(Long id);
    Message getByMessage(Long id);
    List<Message> getAll();
}
