package com.example.hellomysqldb.hellomysqldb.service;

import com.example.hellomysqldb.hellomysqldb.entity.Hello;
import com.example.hellomysqldb.hellomysqldb.repository.HelloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    @Autowired
    HelloRepository helloRepository;
    public Hello getMessage(int id){
        return helloRepository.findById(id).get();
    }
}
