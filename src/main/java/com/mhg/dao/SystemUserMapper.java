package com.mhg.dao;

import com.mhg.pojo.SystemUser;
import com.mhg.pojo.SystemUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemUserMapper {
    long countByExample(SystemUserExample example);

    int deleteByExample(SystemUserExample example);

    int deleteByPrimaryKey(Long userid);

    int insert(SystemUser record);

    int insertSelective(SystemUser record);

    List<SystemUser> selectByExample(SystemUserExample example);

    SystemUser selectByPrimaryKey(Long userid);

    int updateByExampleSelective(@Param("record") SystemUser record, @Param("example") SystemUserExample example);

    int updateByExample(@Param("record") SystemUser record, @Param("example") SystemUserExample example);

    int updateByPrimaryKeySelective(SystemUser record);

    int updateByPrimaryKey(SystemUser record);

    //*********************************************
    SystemUser findByusername(String username);

}