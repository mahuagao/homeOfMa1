package com.mhg.dao;

import com.mhg.pojo.RoleTable;
import com.mhg.pojo.RoleTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleTableMapper {
    long countByExample(RoleTableExample example);

    int deleteByExample(RoleTableExample example);

    int deleteByPrimaryKey(Long roleid);

    int insert(RoleTable record);

    int insertSelective(RoleTable record);

    List<RoleTable> selectByExample(RoleTableExample example);

    RoleTable selectByPrimaryKey(Long roleid);

    int updateByExampleSelective(@Param("record") RoleTable record, @Param("example") RoleTableExample example);

    int updateByExample(@Param("record") RoleTable record, @Param("example") RoleTableExample example);

    int updateByPrimaryKeySelective(RoleTable record);

    int updateByPrimaryKey(RoleTable record);

    //***************************************
    String findtypyById(Long roleid);

}