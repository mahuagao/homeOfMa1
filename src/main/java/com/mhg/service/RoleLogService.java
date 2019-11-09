package com.mhg.service;

import com.mhg.pojo.RoleLog;

import java.util.List;

public interface RoleLogService {

    //添加日志
    public void addLog(RoleLog pojo);

    //查询全部
    public List<RoleLog> findAll();

}
