package com.atosdigitalacademy.Forum_V1.Service;

import com.atosdigitalacademy.Forum_V1.Service.dtos.SubjectDTO;

import java.util.List;
import java.util.Optional;

public interface SubjectService {

    SubjectDTO save(SubjectDTO subjectDTO);
//    SubjectDTO update(SubjectDTO subjectDTO);
//    SubjectDTO update(SubjectDTO subjectDTO, Long id);

//    Optional<SubjectDTO> findOne(Long id_subject);
    SubjectDTO getSubjectById(SubjectDTO subjectDTO, Long id);
    List<SubjectDTO> findAll();
    void delete(Long id_user);

}
