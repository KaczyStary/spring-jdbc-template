package com.piotrowski.springjdbctemplate.model;

import lombok.Builder;
import lombok.Data;

import java.util.HashMap;

@Data
@Builder
public class Book {

    private int id;
    private String author;
    private String title;


}
