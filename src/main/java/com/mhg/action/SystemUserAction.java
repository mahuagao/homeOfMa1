package com.mhg.action;

import com.mhg.annotation.WebLog;
import com.mhg.pojo.SystemUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class SystemUserAction {

    @RequestMapping("/syslogin.do")
    public String login(HttpServletRequest request){
       // if ((!StringUtils.isBlank(checkcode))&&key.contentEquals(checkcode)){  登录没有验证码时，注销这一行，有时，进行开发
        HttpSession session = request.getSession();
            //获取当前用户对象
            Subject subject = SecurityUtils.getSubject();
            //获取前端数据
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String guest = request.getParameter("guest");
            //判断
            if ("yes".equals(guest)){   //如果是游客
                username = new String("mahuagui");
                password = new String("k030820");
            }
            //生成令牌（传入用户输入的账号和密码）
            //UsernamePasswordToken token = new UsernamePasswordToken(
            //model.getUsername(),MD5Utils.md5(model.getPassword()));
            UsernamePasswordToken token = new UsernamePasswordToken(username,password);
            //认证登录
            try{
                //这里会加载自定义的realm
                //把令牌放到login里面进行查询，如果查询账号和密码时候匹配，如果匹配就把对象获取出来，失败就抛异常
                subject.login(token);
                //获取登录成功的用户对象（以前是直接去service里面查）
                SystemUser systemUser = (SystemUser)subject.getPrincipal();
                //ServletActionContext.getRequest().getSession().setAttribute("user",systemUser);
                session.setAttribute("user",systemUser);
                return "System";
            }catch(Exception e){
                //认证登录失败抛出异常
                //addActionError("用户名和密码不匹配...");
                return "login";
            }
        }


        @RequestMapping("/logout.do")
        public void logout(){
            //无需写任何内容
        }

}
