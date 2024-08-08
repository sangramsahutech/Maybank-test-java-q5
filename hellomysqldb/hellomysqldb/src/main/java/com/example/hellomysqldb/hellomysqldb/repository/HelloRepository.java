package com.example.hellomysqldb.hellomysqldb.repository;

import com.example.hellomysqldb.hellomysqldb.entity.Hello;
import org.springframework.data.repository.CrudRepository;

public interface HelloRepository extends CrudRepository<Hello, Integer> {

}
