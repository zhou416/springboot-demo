package com.wjs.springbootdemo.dao;

import com.wjs.springbootdemo.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsertestDao {
    List<User> test(int id);
}
