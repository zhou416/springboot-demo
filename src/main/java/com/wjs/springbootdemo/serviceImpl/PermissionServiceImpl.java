package com.wjs.springbootdemo.serviceImpl;

import com.wjs.springbootdemo.dao.PermissionDao;
import com.wjs.springbootdemo.domain.Permission;
import com.wjs.springbootdemo.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("permissionserviceimpl")
@Primary
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private PermissionDao td;

    public Permission select(int id){
        return td.select(id);
    }
    public boolean insert(Permission user){
        return td.insert(user);
    }
    public boolean delete(int id){
        return td.delete(id);
    }
    public boolean update(Permission user){
        return td.update(user);
    }
}