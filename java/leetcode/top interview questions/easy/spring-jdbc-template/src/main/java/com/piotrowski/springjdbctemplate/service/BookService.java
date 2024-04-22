package com.piotrowski.springjdbctemplate.service;

import com.piotrowski.springjdbctemplate.model.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@Slf4j
public class BookService {
    private final JdbcTemplate template;

    public BookService(JdbcTemplate template) {
        this.template = template;
    }

    public List<Book> findAllBooks(){
        return template.query("select id, title, author from books",
                (row, n)->
                    Book.builder()
                            .id(row.getInt("id"))
                            .title(row.getString("title"))
                            .author(row.getString("author"))
                            .build()
                );
    }

    public Book saveBook(Book book){
        KeyHolder keyHolder = new GeneratedKeyHolder();
        final int rowInserted = template.update(
                con -> {
                    PreparedStatement statement = con.prepareStatement(
                            "insert into books (title, author) values (?, ?)",
                            new String[]{"id"});
                    statement.setString(1, book.getTitle());
                    statement.setString(2, book.getAuthor());
                    return statement;
                }, keyHolder
        );

        book.setId(
                Objects.requireNonNull(
                        keyHolder.getKey()
                        ).intValue()
        );

        return book;
    }

    public int deleteBookById(int id){
        return template.update("delete from books where id = ?", p -> p.setInt(1,id));
    }

    public Optional<Book> findBookById(int id){
        try{
            return Optional.of(template.queryForObject(
                    "select id, title, author from books where id=?",
                    (row, n) ->
                            Book.builder()
                                    .id(row.getInt("id"))
                                    .title(row.getString("title"))
                                    .author(row.getString("author"))
                                    .build(),
                    new Object[]{id}
            ));
        }catch (DataAccessException e){
            log.error(e.getMessage());
            return Optional.empty();
        }
    }
}
