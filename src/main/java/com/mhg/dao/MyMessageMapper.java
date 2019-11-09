package com.mhg.dao;

import com.mhg.pojo.MyMessage;
import com.mhg.pojo.MyMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MyMessageMapper {
    long countByExample(MyMessageExample example);

    int deleteByExample(MyMessageExample example);

    int deleteByPrimaryKey(Integer meid);

    int insert(MyMessage record);

    int insertSelective(MyMessage record);

    List<MyMessage> selectByExample(MyMessageExample example);

    MyMessage selectByPrimaryKey(Integer meid);

    int updateByExampleSelective(@Param("record") MyMessage record, @Param("example") MyMessageExample example);

    int updateByExample(@Param("record") MyMessage record, @Param("example") MyMessageExample example);

    int updateByPrimaryKeySelective(MyMessage record);

    int updateByPrimaryKey(MyMessage record);

    //*****************************

    List<MyMessage> selectAll();
}