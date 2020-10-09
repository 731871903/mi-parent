package com.yc.springcloud81.consumer.service;

import com.yc.springcloud81.consumer.bean.Book;

/**
 * @author Liweicheng
 * @create 2020/10/8 - 13:36
 */
public interface BookService {
    public Book getBook(Integer id);
}
