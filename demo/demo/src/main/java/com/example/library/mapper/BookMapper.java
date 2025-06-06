package com.example.library.mapper;
import com.example.library.entity.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {
    List<Book> getAllBooks();
    Book getBookById(String bookId);
    Book getBookByName(String bookName);
}
