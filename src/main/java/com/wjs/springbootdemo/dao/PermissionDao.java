package com.wjs.springbootdemo.dao;

import com.wjs.springbootdemo.domain.Permission;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionDao {
    boolean insert(Permission permission);
    boolean delete(int id);
    boolean update(Permission user);
    Permission    select(int id);
}
