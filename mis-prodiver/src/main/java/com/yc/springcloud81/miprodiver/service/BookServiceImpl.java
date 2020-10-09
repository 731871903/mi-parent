package com.yc.springcloud81.miprodiver.service;

import com.yc.springcloud81.miprodiver.bean.Book;
import com.yc.springcloud81.miprodiver.dao.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Liweicheng
 * @create 2020/10/8 - 14:28
 */
@Service
public class BookServiceImpl implements  BookService{
    @Autowired(required = false)
    private BookMapper bookMapper;

    public Book getBook(Integer id){
        //根据主键查
        return bookMapper.selectByPrimaryKey(id);
    }
}
