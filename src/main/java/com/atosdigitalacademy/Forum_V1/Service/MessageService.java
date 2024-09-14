package com.atosdigitalacademy.Forum_V1.Service;

import com.atosdigitalacademy.Forum_V1.Service.dtos.MessageDTO;

import java.util.List;
import java.util.Optional;

public interface MessageService {

    List<MessageDTO> getAllMessages();
    Optional<MessageDTO> getMessageById(Long id);
    MessageDTO createMessage(MessageDTO messageDTO);

}
