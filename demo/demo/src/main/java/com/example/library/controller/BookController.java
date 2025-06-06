package com.example.library.controller;

import com.example.library.entity.Book;
import com.example.library.service.BookService;
import com.example.library.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    // 查询所有图书
    @GetMapping("/list")
    public Result<List<Book>> getAllBooks() {
        List<Book> books = bookService.getAllBooks();
        return Result.success(books);
    }

    // 根据图书编号查询图书
    @GetMapping("/searchById")
    public Result<Book> getBookById(@RequestParam String bookId) {
        Book book = bookService.getBookById(bookId);
        if (book != null) {
            return Result.success(book);
        } else {
            return Result.error("未找到图书");
        }
    }

    // 根据图书名称查询图书
    @GetMapping("/searchByName")
    public Result<Book> getBookByName(@RequestParam String bookName) {
        Book book = bookService.getBookByName(bookName);
        if (book != null) {
            return Result.success(book);
        } else {
            return Result.error("未找到图书");
        }
    }
}