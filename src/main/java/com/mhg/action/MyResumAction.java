package com.mhg.action;

import com.mhg.dto.MyResumDTO;
import com.mhg.service.MyResumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MyResumAction {

    //控制层依赖服务层
    @Autowired
    private MyResumService myResumService;

    //查询首条简历信息(加上了获取全部简历主键的服务)
    @RequestMapping("/findResum.do")
    public ModelAndView getResum(HttpServletRequest request){
        MyResumDTO dto = new MyResumDTO();
        dto = myResumService.findResum();
        //获取全部简历主键
        List<String> inames = new ArrayList<>();
        inames = myResumService.findAlliname();

        ModelAndView mv = new ModelAndView();
        mv.addObject("inames",inames);
        mv.addObject("dto",dto);
        mv.setViewName("his_resume1");
        return mv;
    }

    //通过主键获取简历
    @RequestMapping("/editResum.do")
    public ModelAndView findResumById(HttpServletRequest request){
        String iname = request.getParameter("iname");
        MyResumDTO dto = new MyResumDTO();
        dto = myResumService.findById(iname);
        ModelAndView mv = new ModelAndView();
        mv.addObject("dto1",dto);
        mv.setViewName("editResum");
        return mv;
    }

    //更新简历
    @RequestMapping("/updaResum.do")
    public ModelAndView updateResum(MyResumDTO dto){
        int i = myResumService.updateResum(dto);
        MyResumDTO dto2 = myResumService.findById(dto.getIname());
        //获取全部简历主键
        List<String> inames = new ArrayList<>();
        inames = myResumService.findAlliname();

        ModelAndView mv = new ModelAndView();
        mv.addObject("success",i);
        mv.addObject("inames",inames);
        mv.addObject("dto",dto2);
        mv.setViewName("his_resume1");
        return mv;
    }

    //创建简历
    @RequestMapping("/addResum.do")
    public ModelAndView addResum(MyResumDTO dto){
        int i = myResumService.addResum(dto);
        ModelAndView mv = new ModelAndView();
        String iname = dto.getIname();
        mv.addObject("iname",iname);
        mv.addObject("success",i);
        mv.setViewName("forward:/findById1.do");
        return mv;
    }

    //通过主键查询简历（加上了获取全部简历主键的服务）
    @RequestMapping("/findById1.do")
    public ModelAndView findById1(HttpServletRequest request){
        String iname = request.getParameter("iname");
        MyResumDTO dto = myResumService.findById1(iname);
        //获取全部简历主键
        List<String> inames = new ArrayList<>();
        inames = myResumService.findAlliname();

        ModelAndView mv = new ModelAndView();
        mv.addObject("inames",inames);
        mv.addObject("dto",dto);
        mv.setViewName("his_resume1");
        return mv;
    }

    //通过主键删除简历
    @RequestMapping("/deleResum.do")
    public ModelAndView deleResumById(HttpServletRequest request){
        String iname = request.getParameter("iname");
        int i = myResumService.deleResum(iname);
        ModelAndView mv = new ModelAndView();
        mv.addObject("success",i);
        mv.setViewName("forward:/findResum.do");
        return mv;
    }

}