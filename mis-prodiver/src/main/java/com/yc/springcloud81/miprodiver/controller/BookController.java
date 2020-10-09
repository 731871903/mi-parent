package com.yc.springcloud81.miprodiver.controller;

import com.yc.springcloud81.miprodiver.bean.Book;
import com.yc.springcloud81.miprodiver.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author Liweicheng
 * @create 2020/10/8 - 14:34
 */
@RestController
@RequestMapping("book")
public class BookController {
@Autowired
private BookService bookService;

@GetMapping("{id}")
public Book getBook(@PathVariable("id") Integer id){
    return bookService.getBook(id);
}
}
