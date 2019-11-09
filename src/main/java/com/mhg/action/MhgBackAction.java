package com.mhg.action;

import com.mhg.dto.MhgBackDTO;
import com.mhg.service.MhgBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MhgBackAction {

    //控制层依赖服务层
    @Autowired
    private MhgBackService mhgBackService;

    //获取时光匆匆列表
    @RequestMapping("/getAllImg.do")
    public ModelAndView getAllImg(HttpServletRequest request){
        List<MhgBackDTO> dtos = new ArrayList<>();
        dtos = mhgBackService.seleAllImg();
        ModelAndView mv = new ModelAndView();
        mv.addObject("dtos",dtos);
        mv.setViewName("his_back");
        return mv;
    }



}
