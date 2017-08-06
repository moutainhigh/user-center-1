package com.dbt.service;

import com.dbt.bean.Module;
import com.dbt.bean.Role;
import com.dbt.bean.User;
import com.dbt.dao.CommonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommonService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    CommonDao commonDao;

    public User findUserByAccount(String account) {
        logger.debug("[findUserByAccount]\t param : {}", account);
        return commonDao.findUserByAccount(account);
    }

    public List<Role> findRolesByUserId(Integer uid) {
        logger.debug("[findRolesByUserId]\t param : {}", uid);
        return commonDao.findRolesByUserId(uid);
    }

    public List<Module> findModulesByRoleId(Integer rid) {
        logger.debug("[findModulesByRoleId]\t param : {}", rid);
        return commonDao.findModulesByRoleId(rid);
    }
}