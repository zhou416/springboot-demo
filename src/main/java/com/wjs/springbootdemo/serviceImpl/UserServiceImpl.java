package com.wjs.springbootdemo.serviceImpl;

import com.wjs.springbootdemo.dao.UserDao;
import com.wjs.springbootdemo.domain.Role;
import com.wjs.springbootdemo.domain.User;
import com.wjs.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userserviceimpl")
@Primary
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao td;

    public User select(int id){
        return td.select(id);
    }
    public boolean insert(User user){
        return td.insert(user);
    }
    public boolean delete(int id){
        return td.delete(id);
    }
    public boolean update(User user){
        return td.update(user);
    }
    public User    selectByName(String name){ return td.selectByName(name); }
    public List<Role> getRoleByUserNmae(String username){return td.getRoleByUserNmae(username);};
//usertest
//    @Autowired
//    private UsertestDao tdd;
//    public List<User> test(int id){ return tdd.test(id); }
}