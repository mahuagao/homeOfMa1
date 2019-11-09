package com.mhg.dao;

import com.mhg.dto.MhgBackDTO;
import com.mhg.pojo.MhgBack;
import com.mhg.pojo.MhgBackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MhgBackMapper {
    long countByExample(MhgBackExample example);

    int deleteByExample(MhgBackExample example);

    int deleteByPrimaryKey(Integer mgid);

    int insert(MhgBack record);

    int insertSelective(MhgBack record);

    List<MhgBack> selectByExample(MhgBackExample example);

    MhgBack selectByPrimaryKey(Integer mgid);

    int updateByExampleSelective(@Param("record") MhgBack record, @Param("example") MhgBackExample example);

    int updateByExample(@Param("record") MhgBack record, @Param("example") MhgBackExample example);

    int updateByPrimaryKeySelective(MhgBack record);

    int updateByPrimaryKey(MhgBack record);

    //***************************
    //获取时光匆匆列表
    List<MhgBack> selectAll();


}