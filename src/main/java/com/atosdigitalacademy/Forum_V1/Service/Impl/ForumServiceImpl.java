package com.atosdigitalacademy.Forum_V1.Service.Impl;

import com.atosdigitalacademy.Forum_V1.Model.Forum;
import com.atosdigitalacademy.Forum_V1.Repositories.ForumRepository;
import com.atosdigitalacademy.Forum_V1.Service.ForumService;
import com.atosdigitalacademy.Forum_V1.Service.dtos.ForumDTO;
import com.atosdigitalacademy.Forum_V1.Service.mapper.ForumMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Slf4j
@Service
@RequiredArgsConstructor
public class ForumServiceImpl implements ForumService {
       private final ForumRepository forumRepository;
       private final ForumMapper forumMapper;

    @Override
    public ForumDTO save(ForumDTO forumDTO) {
        log.debug("Saving a forum :{}",forumDTO);

        Forum forum = forumMapper.toEntity(forumDTO);
        forum = forumRepository.save(forum);
        return forumMapper.toDto(forum);
    }

    @Override
    public ForumDTO update(ForumDTO forumDTO) {
        log.debug("Update a forum {}", forumDTO);

        return findById(forumDTO.getId()).map(forum ->{
            forum.setName(forumDTO.getName());
            forum.setDescription(forumDTO.getDescription());
            return save(forum);
        }).orElseThrow(()-> new IllegalArgumentException("Forum not found"));
    }

    @Override
    public ForumDTO update(ForumDTO forumDTO, Long id) {
        log.debug("Update a forum {}", forumDTO);

        forumDTO.setId(id);
        return update(forumDTO);
    }

    @Override
    public Optional<ForumDTO> findById(Long id) {
        log.debug("Get a forum {}", id);

        return forumRepository.findById(id).map(forum -> {
            return forumMapper.toDto(forum);
        });
    }


    @Override
    public List<ForumDTO> findAll() {
        log.debug("get all forums");

        return forumRepository.findAll().stream().map(forum ->{
            return forumMapper.toDto(forum);
        }).toList();
    }

    @Override
    public void delete(Long id) {
        log.debug("Delete forum id {}", id);

        forumRepository.deleteById(id);

    }
}
