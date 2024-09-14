package com.atosdigitalacademy.Forum_V1.Service.Impl;

import com.atosdigitalacademy.Forum_V1.Model.Forum;
import com.atosdigitalacademy.Forum_V1.Model.Subject;
import com.atosdigitalacademy.Forum_V1.Repositories.SubjectRepository;
import com.atosdigitalacademy.Forum_V1.Service.SubjectService;
import com.atosdigitalacademy.Forum_V1.Service.dtos.ForumDTO;
import com.atosdigitalacademy.Forum_V1.Service.dtos.SubjectDTO;
import com.atosdigitalacademy.Forum_V1.Service.mapper.SubjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
@Slf4j
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {

    private final SubjectRepository subjectRepository;
    private final SubjectMapper subjectMapper;
    @Override
    public SubjectDTO save(SubjectDTO subjectDTO) {
        log.debug("Saving a subject :{}",subjectDTO);

        Subject subject = subjectMapper.toEntity(subjectDTO);
        subject = subjectRepository.save(subject);
        return subjectMapper.toDto(subject);
    }

    @Override
    public SubjectDTO getSubjectById(SubjectDTO subjectDTO, Long id) {
        return null;
    }

//    @Override
//    public SubjectDTO update(SubjectDTO subjectDTO) {
//        log.debug("Update subject {}", subjectDTO);
//
//        return findOne(subjectDTO.getId()).map(subject ->{
//            subject.setTitle(subjectDTO.getTitle());
//            return save(subject);
//        }).orElseThrow(()-> new IllegalArgumentException("Subject not found !"));    }

//    @Override
//    public SubjectDTO update(SubjectDTO subjectDTO, Long id) {
//        log.debug("Update subject {}", id);
//
//        subjectDTO.setId(id);
//        return update(subjectDTO);
//    }

//    @Override
//    public Optional<SubjectDTO> findOne(Long id) {
//        log.debug("Get subject {}", id);
//
//        return subjectRepository.findById(id).map(subject -> {
//            return subjectMapper.toDto(subject);
//        });
//    }

    @Override
    public List<SubjectDTO> findAll() {
        log.debug("Get all a subject ");

        return subjectRepository.findAll().stream().map(subject -> {
            return subjectMapper.toDto(subject);
        }).toList();
    }


    @Override
    public void delete(Long id) {
        log.debug("Delete subject {}", id);

        subjectRepository.deleteById(id);

    }
}
