package com.atosdigitalacademy.Forum_V1.Repositories;

import com.atosdigitalacademy.Forum_V1.Model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
