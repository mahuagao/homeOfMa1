package com.mhg.service;

import com.mhg.dto.MyDocumentDTO;

import java.util.List;

public interface MyDocumentService {

    //获取文件列表
    List<MyDocumentDTO> findAll();

    //上传文件
    int insertFile(MyDocumentDTO dto);
}
