package com.wjs.springbootdemo.service;

import com.wjs.springbootdemo.domain.Role;
import com.wjs.springbootdemo.domain.User;

import java.util.List;

public interface UserService {
    boolean insert(User user);
    boolean delete(int id);
    boolean update(User user);
    User    select(int id);
    User    selectByName(String name);
    List<Role> getRoleByUserNmae(String username);
    //usertest
    //    List<User> test(int id );
}
