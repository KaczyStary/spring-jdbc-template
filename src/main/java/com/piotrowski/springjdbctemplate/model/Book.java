package com.piotrowski.springjdbctemplate.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Book {

    private int id;
    private String author;
    private String title;


}
