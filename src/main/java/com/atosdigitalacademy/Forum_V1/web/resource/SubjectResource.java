package com.atosdigitalacademy.Forum_V1.web.resource;

import com.atosdigitalacademy.Forum_V1.Service.ForumService;
import com.atosdigitalacademy.Forum_V1.Service.SubjectService;
import com.atosdigitalacademy.Forum_V1.Service.dtos.ForumDTO;
import com.atosdigitalacademy.Forum_V1.Service.dtos.SubjectDTO;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@Slf4j
@RestController
@RequestMapping("/api/subjects")
public class SubjectResource {

    private final SubjectService subjectService;

    @PostMapping
    @ApiResponse(responseCode = "200", description = "Request to save subject")
    public ResponseEntity<SubjectDTO> saveForum(@RequestBody SubjectDTO subjectDTO){
        log.debug("REST Request to save:{}",subjectDTO);

        return new ResponseEntity<>(subjectService.save(subjectDTO), HttpStatus.CREATED);
    }




    @GetMapping
    public List<SubjectDTO> getAllForum(){
        log.debug("REST Request to all forum");

        return subjectService.findAll();
    }

}
