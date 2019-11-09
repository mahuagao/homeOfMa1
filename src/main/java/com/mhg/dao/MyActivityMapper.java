package com.mhg.dao;

import com.mhg.pojo.MyActivity;
import com.mhg.pojo.MyActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MyActivityMapper {
    long countByExample(MyActivityExample example);

    int deleteByExample(MyActivityExample example);

    int deleteByPrimaryKey(Long acid);

    int insert(MyActivity record);

    int insertSelective(MyActivity record);

    List<MyActivity> selectByExample(MyActivityExample example);

    MyActivity selectByPrimaryKey(Long acid);

    int updateByExampleSelective(@Param("record") MyActivity record, @Param("example") MyActivityExample example);

    int updateByExample(@Param("record") MyActivity record, @Param("example") MyActivityExample example);

    int updateByPrimaryKeySelective(MyActivity record);

    int updateByPrimaryKey(MyActivity record);

    //*****************************
    //查找全部动态
    List<MyActivity> selectAll();

}