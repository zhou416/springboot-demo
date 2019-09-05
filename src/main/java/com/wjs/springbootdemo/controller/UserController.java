package com.wjs.springbootdemo.controller;

import com.wjs.springbootdemo.domain.Role;
import com.wjs.springbootdemo.domain.User;
import com.wjs.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    @Qualifier("userserviceimpl")
    private UserService ts;

    @RequestMapping(value="/user_select/{id}",method = RequestMethod.GET)
    public User user_select(@PathVariable int id){
        User user = ts.select(id);
        return user;
    }
    @RequestMapping("/user_insert/{id}/{name}/{password}")
    public boolean user_insert(@PathVariable int id,@PathVariable String name,@PathVariable String password){
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setPassword(password);
        return ts.insert(user);
    }
    @RequestMapping("/user_delete/{id}")
    public boolean user_delete(@PathVariable int id){
        return ts.delete(id);
    }
    @RequestMapping("/user_update/{id}/{name}/{password}")
    public boolean user_update(@PathVariable int id,@PathVariable String name,@PathVariable String password){
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setPassword(password);
        return ts.update(user);
    }
    @RequestMapping("/user_getRoleByUserNmae/{username}")
    public List<Role> user_getRoleByUserNmae(@PathVariable String username){
        return ts.getRoleByUserNmae(username);
    }
    @RequestMapping("/user_selectByName")
    public User selectByName(@RequestParam String name){
        return ts.selectByName(name);
    }
    //usertest
//    @RequestMapping("/user_test/{id}")
//    public List<User> user_test(@PathVariable int id){
//        return ts.test(id);
//    }
}
