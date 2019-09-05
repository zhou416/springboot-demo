package com.wjs.springbootdemo.controller;

import com.wjs.springbootdemo.domain.Permission;
import com.wjs.springbootdemo.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PermissionController {
    @Autowired
    @Qualifier("permissionserviceimpl")
    private PermissionService ts;

    @RequestMapping(value="/permission_select/{id}",method = RequestMethod.GET)
    public Permission permission_select(@PathVariable int id){
        Permission user = ts.select(id);
        return user;
    }
    @RequestMapping("/permission_insert/{id}/{permission}/{role_id}")
    public boolean permission_insert(@PathVariable int id,@PathVariable String permission,@PathVariable int role_id){
        Permission user = new Permission();
        user.setId(id);
        user.setRole_id(role_id);
        user.setPermission(permission);
        return ts.insert(user);
    }
    @RequestMapping("/permission_delete/{id}")
    public boolean permission_delete(@PathVariable int id){
        return ts.delete(id);
    }
    @RequestMapping("/permission_update/{id}/{permission}/{role_id}")
    public boolean permission_update(@PathVariable int id,@PathVariable String permission,@PathVariable int role_id){
        Permission user = new Permission();
        user.setId(id);
        user.setRole_id(role_id);
        user.setPermission(permission);
        return ts.update(user);
    }
}
