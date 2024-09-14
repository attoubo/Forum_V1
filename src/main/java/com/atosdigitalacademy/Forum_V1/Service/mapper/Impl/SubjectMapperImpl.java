package com.atosdigitalacademy.Forum_V1.Service.mapper.Impl;

import com.atosdigitalacademy.Forum_V1.Model.Subject;
import com.atosdigitalacademy.Forum_V1.Service.dtos.SubjectDTO;
import com.atosdigitalacademy.Forum_V1.Service.mapper.SubjectMapper;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;


@RequiredArgsConstructor
@Component
public class SubjectMapperImpl implements SubjectMapper {

    private final ModelMapper modelMapper;
    @Override
    public SubjectDTO toDto(Subject entity) {
        return modelMapper.map(entity, SubjectDTO.class);
    }

    @Override
    public Subject toEntity(SubjectDTO dto) {
        return modelMapper.map(dto, Subject.class);
    }
}
