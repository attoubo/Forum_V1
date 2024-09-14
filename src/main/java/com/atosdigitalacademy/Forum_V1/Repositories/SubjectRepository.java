package com.atosdigitalacademy.Forum_V1.Repositories;

import com.atosdigitalacademy.Forum_V1.Model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
    Collection<Object> findByForumId(Long forumId);
}
