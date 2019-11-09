package com.mhg.service;

import com.mhg.dao.MyDocumentMapper;
import com.mhg.dto.MyDocumentDTO;
import com.mhg.pojo.MyDocument;
import com.mhg.utils.DocSizeUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Service
public class MyDocumentServiceImpl implements MyDocumentService {

    //服务层依赖持久层
    @Autowired
    private MyDocumentMapper myDocumentMapper;

    //获取文件列表
    @Override
    public List<MyDocumentDTO> findAll() {
        List<MyDocumentDTO> dtos = new LinkedList<>();
        List<MyDocument> records = new ArrayList<>();
        records = myDocumentMapper.selectAll();
        for (MyDocument record : records){
            MyDocumentDTO dto = new MyDocumentDTO();
            BeanUtils.copyProperties(record,dto);
            String dsize = dto.getDocsize();
            String dsize1 = DocSizeUtils.ctdoc(dsize);
            dto.setDocsize(dsize1);
            dtos.add(dto);
        }
        return dtos;
    }

    //上传文件
    @Override
    public int insertFile(MyDocumentDTO dto) {
        MyDocument record = new MyDocument();
        BeanUtils.copyProperties(dto,record);
        int i = myDocumentMapper.insertSelective(record);
        return i;
    }
}