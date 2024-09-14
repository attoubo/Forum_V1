package com.atosdigitalacademy.Forum_V1.Service;

import com.atosdigitalacademy.Forum_V1.Service.dtos.ForumDTO;

import java.util.List;
import java.util.Optional;


public interface ForumService {

    ForumDTO save(ForumDTO forumDTO);
    ForumDTO update(ForumDTO forumDTO);
    ForumDTO update(ForumDTO forumDTO, Long id);
    Optional<ForumDTO> findById(Long id);
    List<ForumDTO> findAll();
    void delete(Long id);
}
