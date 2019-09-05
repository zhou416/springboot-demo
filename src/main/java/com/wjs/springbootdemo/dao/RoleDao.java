package com.wjs.springbootdemo.dao;

import com.wjs.springbootdemo.domain.Permission;
import com.wjs.springbootdemo.domain.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleDao {
    boolean insert(Role role);
    boolean delete(int id);
    boolean update(Role role);
    Role    select(int id);
    List<Permission> getPermissionByRoleId(int role_id);
}
