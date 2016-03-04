package com.auction.service.impl;

import com.auction.model.Message;
import com.auction.repository.MessageRepository;
import com.auction.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("messageService")
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageRepository messageRepository;

    @Override
    public Message addMessage(Message message) {
        return messageRepository.save(message);
    }

    @Override
    public void delete(Long id) {
        messageRepository.delete(id);
    }

    @Override
    public Message getByMessage(Long id) {
        return messageRepository.getOne(id);
    }

    @Override
    public List<Message> getAll() {
        return messageRepository.findAll();
    }
}

