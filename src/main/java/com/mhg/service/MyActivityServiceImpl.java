package com.mhg.service;

import com.mhg.dao.MyActivityMapper;
import com.mhg.dto.MyActivityDTO;
import com.mhg.pojo.MyActivity;
import com.mhg.utils.MyDateUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Service
public class MyActivityServiceImpl implements MyActivityService {

    //服务层依赖持久层
    @Autowired
    private MyActivityMapper myActivityMapper;

    //获取动态列表
    @Override
    public List<MyActivityDTO> SeleActivity() {
        List<MyActivityDTO> dtos = new LinkedList<>();
        List<MyActivity> records = new ArrayList<>();
        records = myActivityMapper.selectAll();
        for (MyActivity record : records){
            MyActivityDTO dto = new MyActivityDTO();
            BeanUtils.copyProperties(record,dto);
            Date cretime = record.getCredate();
            String cretm = MyDateUtils.dateToString(cretime);
            dto.setCredate(cretm);
            dtos.add(dto);
        }
        return dtos;
    }
}
