package com.dbt.dao;


import com.dbt.bean.Permission;

import java.util.List;
import java.util.Map;

public interface PermissionDao {

    List<Permission> getByMap(Map<String, Object> map);

    Permission getById(Integer id);

    List<Permission> getList();

    List<Permission> getByUserId(Integer userId);

}