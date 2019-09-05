package com.wjs.springbootdemo.dao;

import com.wjs.springbootdemo.domain.Role;
import com.wjs.springbootdemo.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    boolean insert(User user);
    boolean delete(int id);
    boolean update(User user);
    User    select(int id);
    User    selectByName(String name);
    List<Role> getRoleByUserNmae(String username);
}
