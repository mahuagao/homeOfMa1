package com.mhg.service;

import com.mhg.dao.MyResumMapper;
import com.mhg.dto.MyResumDTO;
import com.mhg.pojo.MyResum;
import com.mhg.utils.MyDateUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class MyResumServiceImpl implements MyResumService {

   //服务层依赖持久层
   @Autowired
   private MyResumMapper myResumMapper;

   //查询首条简历信息
    @Override
    public MyResumDTO findResum() {
        MyResum pojo = myResumMapper.selectResum();
        MyResumDTO dto = new MyResumDTO();
        BeanUtils.copyProperties(pojo,dto);
        Date gra = pojo.getGradutedate();
        Date bir = pojo.getBirthday();
        String graduate = MyDateUtils.dateToString1(gra);
        String birthday = MyDateUtils.dateToString1(bir);
        dto.setGradutedate(graduate);
        dto.setBirthday(birthday);
        return dto;
    }

    //按照主键查询简历
    @Override
    public MyResumDTO findById(String iname) {
        MyResum pojo = myResumMapper.selectByPrimaryKey(iname);
        MyResumDTO dto = new MyResumDTO();
        BeanUtils.copyProperties(pojo,dto);
        Date gra = pojo.getGradutedate();
        Date bir = pojo.getBirthday();
        String graduate = MyDateUtils.dateToString1(gra);
        String birthday = MyDateUtils.dateToString1(bir);
        dto.setGradutedate(graduate);
        dto.setBirthday(birthday);
        return dto;
    }

    //根据主键更新简历
    @Override
    public int updateResum(MyResumDTO dto) {
        int i;
        MyResum record = new MyResum();
        BeanUtils.copyProperties(dto,record);
        String gra = dto.getGradutedate();
        String bir = dto.getBirthday();
        Date gradutedate = MyDateUtils.strToDate1(gra);
        Date birthday = MyDateUtils.strToDate1(bir);
        record.setGradutedate(gradutedate);
        record.setBirthday(birthday);
        i = myResumMapper.updateByPrimaryKeySelective(record);
        return i;
    }

    //添加简历
    @Override
    public int addResum(MyResumDTO dto) {
        MyResum record = new MyResum();
        BeanUtils.copyProperties(dto,record);
        String gra = dto.getGradutedate();
        String bir = dto.getBirthday();
        Date gradutedate = MyDateUtils.strToDate1(gra);
        Date birthday = MyDateUtils.strToDate1(bir);
        record.setGradutedate(gradutedate);
        record.setBirthday(birthday);
        int i = myResumMapper.insertSelective(record);
        return i;
    }

    //按照主键查询简历
    @Override
    public MyResumDTO findById1(String iname) {
        MyResum pojo = new MyResum();
        MyResumDTO dto = new MyResumDTO();
        pojo = myResumMapper.findById1(iname);
        BeanUtils.copyProperties(pojo,dto);
        Date gra = pojo.getGradutedate();
        Date bir = pojo.getBirthday();
        String gradutedate = MyDateUtils.dateToString1(gra);
        String birthday = MyDateUtils.dateToString1(bir);
        dto.setGradutedate(gradutedate);
        dto.setBirthday(birthday);
        return dto;
    }

    //获取全部简历的主键
    @Override
    public List<String> findAlliname() {
        List<String> inames = new ArrayList<>();
        inames = myResumMapper.selectAllIname();
        return inames;
    }

    //根据主键删除简历
    @Override
    public int deleResum(String iname) {
        int i = myResumMapper.deleteByPrimaryKey(iname);
        return i;
    }
}