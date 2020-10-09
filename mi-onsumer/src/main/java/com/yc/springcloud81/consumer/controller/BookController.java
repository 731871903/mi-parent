package com.yc.springcloud81.consumer.controller;

import com.yc.springcloud81.consumer.bean.Book;
import com.yc.springcloud81.consumer.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("book")
public class BookController {
    @Autowired
    private BookService bookService;


    @GetMapping("{id}")
    public Book getBook(@PathVariable("id" ) Integer id ){
        return bookService.getBook(id);
    }
}