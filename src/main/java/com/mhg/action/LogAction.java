package com.mhg.action;

import com.mhg.annotation.WebLog;
import com.mhg.pojo.RoleLog;
import com.mhg.service.RoleLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/log")
public class LogAction {
    @Autowired
    private RoleLogService roleLogService;


    @ResponseBody
    @RequestMapping("/logList.do")
    public List<RoleLog> logList(HttpServletRequest request){
        List<RoleLog> all = roleLogService.findAll();
        return all;
    }
}
