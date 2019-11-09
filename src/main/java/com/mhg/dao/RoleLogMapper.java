package com.mhg.dao;

import com.mhg.pojo.RoleLog;
import com.mhg.pojo.RoleLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleLogMapper {
    long countByExample(RoleLogExample example);

    int deleteByExample(RoleLogExample example);

    int deleteByPrimaryKey(Long logid);

    int insert(RoleLog record);

    int insertSelective(RoleLog record);

    List<RoleLog> selectByExample(RoleLogExample example);

    RoleLog selectByPrimaryKey(Long logid);

    int updateByExampleSelective(@Param("record") RoleLog record, @Param("example") RoleLogExample example);

    int updateByExample(@Param("record") RoleLog record, @Param("example") RoleLogExample example);

    int updateByPrimaryKeySelective(RoleLog record);

    int updateByPrimaryKey(RoleLog record);
}