package com.wjs.springbootdemo.controller;

import com.wjs.springbootdemo.domain.Permission;
import com.wjs.springbootdemo.domain.Role;
import com.wjs.springbootdemo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {
    @Autowired
    @Qualifier("roleserviceimpl")
    private RoleService ts;

    @RequestMapping(value="/role_select/{id}",method = RequestMethod.GET)
    public Role role_select(@PathVariable int id){
        Role user = ts.select(id);
        return user;
    }
    @RequestMapping("/role_insert/{id}/{role_name}/{user_id}")
    public Boolean role_insert(@PathVariable int id,@PathVariable String role_name,@PathVariable int user_id){
        Role user = new Role();
        user.setId(id);
        user.setRole_name(role_name);
        user.setUser_id(user_id);
        return ts.insert(user);
    }
    @RequestMapping("/role_delete/{id}")
    public Boolean role_delete(@PathVariable int id){
        return ts.delete(id);
    }
    @RequestMapping("/role_update/{id}/{role_name}/{user_id}")
    public Boolean role_update(@PathVariable int id,@PathVariable String role_name,@PathVariable int user_id){
        Role user = new Role();
        user.setId(id);
        user.setRole_name(role_name);
        user.setUser_id(user_id);
        return ts.update(user);
    }
    @RequestMapping("/role_getPermissionByRoleId/{role_id}")
    public List<Permission> role_getPermissionByRoleId(@PathVariable int role_id){
        return ts.getPermissionByRoleId(role_id);
    }
}
