package com.mhg.service;

import com.mhg.dao.MhgBackMapper;
import com.mhg.dto.MhgBackDTO;
import com.mhg.pojo.MhgBack;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Service
public class MhgBackServiceImpl implements MhgBackService {

    //服务层依赖持久层
    @Autowired
    private MhgBackMapper mhgBackMapper;

    //获取时光匆匆列表
    @Override
    public List<MhgBackDTO> seleAllImg() {
        List<MhgBack> records = new ArrayList<>();
        List<MhgBackDTO> dtos = new LinkedList<>();
        records = mhgBackMapper.selectAll();
        for (MhgBack record : records){
            MhgBackDTO dto = new MhgBackDTO();
            BeanUtils.copyProperties(record,dto);
            dtos.add(dto);
        }
        return dtos;
    }



}