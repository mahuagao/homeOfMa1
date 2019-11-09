package com.mhg.service;

import com.mhg.dao.MyMessageMapper;
import com.mhg.dto.MyMessageDTO;
import com.mhg.pojo.MyMessage;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyMessageServiceImpl implements MyMessageService {

    //服务层依赖持久层
    @Autowired
    private MyMessageMapper myMessageMapper;

    //添加留言
    @Override
    public int addMessage(MyMessageDTO dto) {
        MyMessage record = new MyMessage();
        BeanUtils.copyProperties(dto,record);
        int i = myMessageMapper.insertSelective(record);
        return i;
    }

    //查询全部留言
    @Override
    public List<MyMessageDTO> selMessage() {
        List<MyMessage> records = new ArrayList<>();
        List<MyMessageDTO> dtos = new ArrayList<>();
        records = myMessageMapper.selectAll();
        for (MyMessage record : records){
            MyMessageDTO dto = new MyMessageDTO();
            BeanUtils.copyProperties(record,dto);
            dtos.add(dto);
            System.out.println("来源ip"+dto.getSouip());
            System.out.println("留言时间"+dto.getMessdate());
            System.out.println("留言人"+dto.getDear());
        }
        return dtos;
    }
}
