package com.atosdigitalacademy.Forum_V1.Service.mapper;

public interface EntityMapper <D, E>{
    D toDto(E entity);
    E toEntity(D dto);
}
