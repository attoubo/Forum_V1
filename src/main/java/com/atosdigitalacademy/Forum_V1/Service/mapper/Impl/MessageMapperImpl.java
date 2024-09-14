package com.atosdigitalacademy.Forum_V1.Service.mapper.Impl;

import com.atosdigitalacademy.Forum_V1.Model.Message;
import com.atosdigitalacademy.Forum_V1.Service.dtos.MessageDTO;
import com.atosdigitalacademy.Forum_V1.Service.mapper.MessageMapper;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;


@RequiredArgsConstructor
@Component
public class MessageMapperImpl implements MessageMapper {

    private final ModelMapper modelMapper;
    @Override
    public MessageDTO toDto(Message entity) {
        return modelMapper.map(entity, MessageDTO.class);
    }

    @Override
    public Message toEntity(MessageDTO dto) {
        return modelMapper.map(dto, Message.class);
    }

}
