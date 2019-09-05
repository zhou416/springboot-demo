package com.wjs.springbootdemo.service;

import com.wjs.springbootdemo.domain.Permission;
import com.wjs.springbootdemo.domain.Role;

import java.util.List;

public interface RoleService {
    boolean insert(Role role);
    boolean delete(int id);
    boolean update(Role role);
    Role    select(int id);
    List<Permission> getPermissionByRoleId(int role_id);
}
