package com.mhg.dao;

import com.mhg.pojo.AuthFunction;
import com.mhg.pojo.AuthFunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthFunctionMapper {
    long countByExample(AuthFunctionExample example);

    int deleteByExample(AuthFunctionExample example);

    int deleteByPrimaryKey(Long authid);

    int insert(AuthFunction record);

    int insertSelective(AuthFunction record);

    List<AuthFunction> selectByExample(AuthFunctionExample example);

    AuthFunction selectByPrimaryKey(Long authid);

    int updateByExampleSelective(@Param("record") AuthFunction record, @Param("example") AuthFunctionExample example);

    int updateByExample(@Param("record") AuthFunction record, @Param("example") AuthFunctionExample example);

    int updateByPrimaryKeySelective(AuthFunction record);

    int updateByPrimaryKey(AuthFunction record);

    //***********************************
    //管理员拥有全部权限
    List<String> findAll();

    //普通用户只有查的权限
    List<String> findOne();
}