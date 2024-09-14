package com.atosdigitalacademy.Forum_V1.web.resource;

import com.atosdigitalacademy.Forum_V1.Service.ForumService;
import com.atosdigitalacademy.Forum_V1.Service.dtos.ForumDTO;
import com.atosdigitalacademy.Forum_V1.Service.dtos.MessageDTO;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RequiredArgsConstructor
@Slf4j
@RestController
@RequestMapping("/api/forums")
public class ForumRessource {

    private final ForumService forumService;

    @PostMapping
    @ApiResponse(responseCode = "200", description = "Request to save forum")
    public ResponseEntity<ForumDTO> saveForum(@RequestBody ForumDTO forumDTO){
        log.debug("REST Request to save:{}",forumDTO);

        return new ResponseEntity<>(forumService.save(forumDTO), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getMessageById(@PathVariable Long id) {
        log.debug("REST Request to get message :{}",id);

        Optional<ForumDTO> forum = forumService.findById(id);
        if (forum.isPresent()) {
            return new ResponseEntity<>(forum, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @GetMapping
    public List<ForumDTO> getAllForum(){
        log.debug("REST Request to all forum");

        return forumService.findAll();
    }
}
