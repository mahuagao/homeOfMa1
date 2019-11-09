package com.mhg.service;

import com.mhg.dto.MyResumDTO;

import java.util.List;

public interface MyResumService {

    //查询首条简历信息
    MyResumDTO findResum();

    //按照主键获取简历
    MyResumDTO findById(String iname);

    //更新简历
    int updateResum(MyResumDTO dto);

    //添加简历
    int addResum(MyResumDTO dto);

    //按照主键查询简历
    MyResumDTO findById1(String iname);

    //获取全部简历的主键
    List<String> findAlliname();

    //根据主键删除简历
    int deleResum(String iname);
}
