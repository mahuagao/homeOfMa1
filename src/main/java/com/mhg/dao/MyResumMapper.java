package com.mhg.dao;

import com.mhg.pojo.MyResum;
import com.mhg.pojo.MyResumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MyResumMapper {
    long countByExample(MyResumExample example);

    int deleteByExample(MyResumExample example);

    int deleteByPrimaryKey(String iname);

    int insert(MyResum record);

    int insertSelective(MyResum record);

    List<MyResum> selectByExample(MyResumExample example);

    MyResum selectByPrimaryKey(String iname);

    int updateByExampleSelective(@Param("record") MyResum record, @Param("example") MyResumExample example);

    int updateByExample(@Param("record") MyResum record, @Param("example") MyResumExample example);

    int updateByPrimaryKeySelective(MyResum record);

    int updateByPrimaryKey(MyResum record);

    //********************************
    //查询首条简历
    MyResum selectResum();

    //根据主键查询简历
    MyResum findById1(String iname);

    //查询全部简历的主键
    List<String> selectAllIname();
}