package com.wjs.springbootdemo.service;

import com.wjs.springbootdemo.domain.Permission;

public interface PermissionService {
    boolean insert(Permission permission);
    boolean delete(int id);
    boolean update(Permission user);
    Permission    select(int id);
}
