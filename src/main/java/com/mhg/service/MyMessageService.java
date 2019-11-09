package com.mhg.service;

import com.mhg.dto.MyMessageDTO;

import java.util.List;

public interface MyMessageService {

    int addMessage(MyMessageDTO dto); //添加留言

    List<MyMessageDTO> selMessage();//查询全部留言
}
