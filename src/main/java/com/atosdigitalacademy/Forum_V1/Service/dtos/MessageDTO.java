package com.atosdigitalacademy.Forum_V1.Service.dtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageDTO {
    private Long id;
    private String author;
    private String content;

}
