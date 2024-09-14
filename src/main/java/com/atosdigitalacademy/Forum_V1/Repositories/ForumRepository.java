package com.atosdigitalacademy.Forum_V1.Repositories;

import com.atosdigitalacademy.Forum_V1.Model.Forum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForumRepository extends JpaRepository<Forum, Long> {
}
