package com.mhg.service;

import com.mhg.dao.RoleLogMapper;
import com.mhg.pojo.RoleLog;
import com.mhg.pojo.RoleLogExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleLogServiceImpl implements RoleLogService {

    @Autowired
    private RoleLogMapper roleLogMapper;

    @Override
    public void addLog(RoleLog pojo) {
        roleLogMapper.insert(pojo);
    }

    @Override
    public List<RoleLog> findAll() {
        RoleLogExample example = new RoleLogExample();
        List<RoleLog> roleLogs = roleLogMapper.selectByExample(example);
        return roleLogs;
    }
}
