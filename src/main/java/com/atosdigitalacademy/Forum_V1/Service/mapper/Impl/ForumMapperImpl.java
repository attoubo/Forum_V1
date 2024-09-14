package com.atosdigitalacademy.Forum_V1.Service.mapper.Impl;

import com.atosdigitalacademy.Forum_V1.Model.Forum;
import com.atosdigitalacademy.Forum_V1.Service.dtos.ForumDTO;
import com.atosdigitalacademy.Forum_V1.Service.mapper.ForumMapper;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ForumMapperImpl implements ForumMapper {
    private final ModelMapper modelMapper;

    @Override
    public ForumDTO toDto(Forum entity) {
        return  modelMapper.map(entity,ForumDTO.class);
    }

    @Override
    public Forum toEntity(ForumDTO dto) {
        return modelMapper.map(dto,Forum.class);
    }
}
