package com.mhg.action;

import com.mhg.annotation.WebLog;
import com.mhg.dto.MyDocumentDTO;
import com.mhg.service.MyDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class MyDocumentAction {
    //控制层依赖服务层
    @Autowired
    private MyDocumentService myDocumentService;


    @RequestMapping("/findAll.do")
    public ModelAndView findAll(HttpServletRequest request){
        List<MyDocumentDTO> dtos = new ArrayList<>();
        dtos = myDocumentService.findAll();
        for(MyDocumentDTO dto :dtos){
            System.out.println(dto.getDid());
        }
        ModelAndView mv = new ModelAndView();
        mv.addObject("dtos",dtos);
        mv.setViewName("his_document");
        return mv;
    }


    @RequestMapping("/findAlll.do")
    public void findAlll(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
        List<MyDocumentDTO> dtos = new ArrayList<>();
        dtos = myDocumentService.findAll();
        request.setAttribute("test","学习是一个循序渐进的过程！");
        request.getRequestDispatcher("/test.jsp").forward(request,response);
    }


    @RequestMapping("/save.do")
    public String uploadFile(HttpServletRequest request, @RequestParam("frfile") MultipartFile multipartFile)throws IOException{
        //得到文件名
        String originalFilename = multipartFile.getOriginalFilename();
        //得到文件大小
        Long size = multipartFile.getSize();
        String docsize = size.toString();
        //设置文件路径
        String docpath = "E:/Java1804/";
        //浏览次数
        long scannum = 0;
        //下载次数
        long downnum = 0;
        MyDocumentDTO dto = new MyDocumentDTO(originalFilename,docsize,docpath,new Date(),scannum,downnum,new Date());
        int i = myDocumentService.insertFile(dto);
        if (i != 0) {
            File dest = new File("E:\\Java1804\\" + originalFilename);
            //得到文件的内容
            multipartFile.transferTo(dest); //把内存中的文件数据写入目标地址
        }
        return "redirect:/findAll.do";
    }




}