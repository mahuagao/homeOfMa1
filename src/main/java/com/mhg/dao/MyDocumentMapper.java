package com.mhg.dao;

import com.mhg.dto.MyDocumentDTO;
import com.mhg.pojo.MyDocument;
import com.mhg.pojo.MyDocumentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MyDocumentMapper {
    long countByExample(MyDocumentExample example);

    int deleteByExample(MyDocumentExample example);

    int deleteByPrimaryKey(Long did);

    int insert(MyDocument record);

    int insertSelective(MyDocument record);

    List<MyDocument> selectByExample(MyDocumentExample example);

    MyDocument selectByPrimaryKey(Long did);

    int updateByExampleSelective(@Param("record") MyDocument record, @Param("example") MyDocumentExample example);

    int updateByExample(@Param("record") MyDocument record, @Param("example") MyDocumentExample example);

    int updateByPrimaryKeySelective(MyDocument record);

    int updateByPrimaryKey(MyDocument record);

    //****************************
    //获取文件列表
    List<MyDocument> selectAll();
}