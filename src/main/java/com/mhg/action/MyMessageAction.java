package com.mhg.action;


import com.mhg.annotation.WebLog;
import com.mhg.dto.MyMessageDTO;
import com.mhg.pojo.MyMessage;
import com.mhg.service.MyMessageService;
import com.mhg.utils.EncodeUtils;
import com.mhg.utils.MyDateUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.omg.IOP.Encoding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class MyMessageAction {
    //控制层依赖服务层
    @Autowired
    private MyMessageService myMessageService;

    //添加留言

    @RequestMapping("/addMsg.do")
    public @ResponseBody String addMsg(HttpServletRequest request)throws IOException {
        request.setCharacterEncoding("UTF-8");

        MyMessageDTO dto = new MyMessageDTO();
        String message1 = request.getParameter("contents");
        String dear = request.getParameter("muser");
        String message = EncodeUtils.unescape(message1);    //将gbk编码的字符串转为UTF-8
        String souip = "127.0.0.1";
        Date messdate = new Date();
        dto.setMessage(message);
        dto.setDear(dear);
        dto.setSouip(souip);
        dto.setMessdate(messdate);

        int i = myMessageService.addMessage(dto);
        if (i>0){
            return "ok";
        }else{
            return "erro";
        }
    }

    //查询留言

    @RequestMapping("/seleAll.do")
    public @ResponseBody String seleAll(HttpServletRequest request){
        List<MyMessageDTO> dtos = new ArrayList<>();
        dtos = myMessageService.selMessage();
        StringBuilder sb = new StringBuilder();
        for (MyMessageDTO dto : dtos){
            sb.append("<div class=\"msglist\">");
            sb.append("<div>留言编号:" + dto.getMeid().toString() + "</div>");
            sb.append("<div>留言标题：" + "best wishes!" + "</div>");
            sb.append("<div>留言内容：" + dto.getMessage() + "</div>");
            sb.append("<div>留言人：" + dto.getDear() + "</div>");
            sb.append("<div>留言IP" + dto.getSouip() + "</div>");
            String adddate = MyDateUtils.dateToString( dto.getMessdate());
            sb.append("<div>添加时间：" + adddate + "</div>");
            sb.append("</div>");
        }

        return sb.toString();
    }

}
