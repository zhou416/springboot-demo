package com.wjs.springbootdemo.serviceImpl;

import com.wjs.springbootdemo.dao.RoleDao;
import com.wjs.springbootdemo.domain.Permission;
import com.wjs.springbootdemo.domain.Role;
import com.wjs.springbootdemo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("roleserviceimpl")
@Primary
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao td;

    public Role select(int id){
        return td.select(id);
    }
    public boolean insert(Role user){
        return td.insert(user);
    }
    public boolean delete(int id){
        return td.delete(id);
    }
    public boolean update(Role user){
        return td.update(user);
    }
    public List<Permission> getPermissionByRoleId(int role_id){
        return td.getPermissionByRoleId(role_id);
    }
}