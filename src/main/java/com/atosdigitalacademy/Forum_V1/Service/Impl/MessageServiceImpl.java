package com.atosdigitalacademy.Forum_V1.Service.Impl;

import com.atosdigitalacademy.Forum_V1.Model.Message;
import com.atosdigitalacademy.Forum_V1.Repositories.MessageRepository;
import com.atosdigitalacademy.Forum_V1.Service.MessageService;
import com.atosdigitalacademy.Forum_V1.Service.dtos.MessageDTO;
import com.atosdigitalacademy.Forum_V1.Service.mapper.Impl.MessageMapperImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Slf4j
public class MessageServiceImpl implements MessageService {

    private final MessageRepository messageRepository;
    private final MessageMapperImpl messageMapper;

    @Override
    public List<MessageDTO> getAllMessages() {
        log.debug("Get all a message ");

        return messageRepository.findAll().stream().map(message -> {
            return messageMapper.toDto(message);
        }).toList();
    }

    @Override
    public Optional<MessageDTO> getMessageById(Long id) {
        log.debug("Get message {}", id);

        return messageRepository.findById(id).map(message -> {
            return messageMapper.toDto(message);
        });
    }

    @Override
    public MessageDTO createMessage(MessageDTO messageDTO) {
        log.debug("Message created :{}", messageDTO);

        Message message = messageMapper.toEntity(messageDTO);
        message = messageRepository.save(message);
        return messageMapper.toDto(message);
    }

}
