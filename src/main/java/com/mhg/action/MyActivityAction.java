package com.mhg.action;

import com.mhg.annotation.WebLog;
import com.mhg.dto.MyActivityDTO;
import com.mhg.service.MyActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MyActivityAction {
    //控制层依赖服务层
    @Autowired
    private MyActivityService myActivityService;

 /*
    @RequestMapping("/seleAct.do")
    public ModelAndView seleAct(HttpServletRequest request){
        List<MyActivityDTO> acts = new ArrayList<>();
        acts = myActivityService.SeleActivity();
        ModelAndView mv = new ModelAndView();
        mv.addObject("acts",acts);
        mv.setViewName("his_life");
        return mv;
    }
*/

    @ResponseBody
    @RequestMapping("/seleAct.do")
    public String seleAct(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<MyActivityDTO> dtos = new ArrayList<>();
        dtos = myActivityService.SeleActivity();
        StringBuilder sb = new StringBuilder();
        for(MyActivityDTO dto : dtos){
            sb.append("<div class=\"acti\">");
            sb.append("<div><h3>" + dto.getAcname() + "</h3></div>");
            sb.append("<div>" + dto.getAcmsg() + "</div>");
            sb.append("<div>" + dto.getMimage() + "</div>");
            sb.append("<div>" + dto.getCredate() + "</div>");
            sb.append("</div>");
        }
        String str = sb.toString();
      return str;
    }
}