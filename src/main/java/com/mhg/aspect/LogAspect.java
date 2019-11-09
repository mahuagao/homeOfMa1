package com.mhg.aspect;

import com.mhg.annotation.WebLog;
import com.mhg.pojo.RoleLog;
import com.mhg.service.RoleLogService;
import com.mhg.utils.JsonUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

@Aspect
@Component
public class LogAspect {

     //加入服务层能力
    @Autowired
    private RoleLogService roleLogService;

    //定义切入点 扫描表现层
    @Pointcut("execution(* com.mhg.action.*.*(..))")
    public void log(){

    }

    //自定义的通知：后置通知  这里就是注解的切面
    @AfterReturning(value = "log()",argNames = "joinPoint,res",returning = "res")
    public void logAfter(JoinPoint joinPoint,Object res) throws ClassNotFoundException{
        if (joinPoint.getArgs()==null){//没有请求
            return;
        }
        //用户操作完接口之后，获取用户请求表现层的行为
        Object[] args = joinPoint.getArgs();//这里最核心的就是request
        HttpServletRequest request = (HttpServletRequest) args[0];//就是得到了request对象
        //有了request对象，就可以获取用户的请求数据。这里针对所有接口
        //获取所有参数的名称 这里是不知道具体的请求参数名称
        Enumeration<String> parameterNames = request.getParameterNames();
        Map<String,String> map = new HashMap<>();
        //map把用户所有请求的key，value都存储起来了。这个内容要存储在表中的字段params
        while (parameterNames.hasMoreElements()){
            String key = parameterNames.nextElement();
            String value = request.getParameter(key);
            map.put(key,value);
        }
        String params = null; //这里存储json字符串
        if (map!=null&&map.size()>0){
            params = JsonUtils.objectToJson(map);
        }

        //获取用户请求的方法名称
        String methodName = joinPoint.getSignature().getName();
        //获取用户操作具体方法的操作行为
        //得到用户操作的类，这里针对的是系统的所有类
        String calssName = joinPoint.getTarget().getClass().getName();
        //得到类的对象
        Class forName = Class.forName(calssName);
        //得到类中的方法
        Method[] methods = forName.getMethods();
        String operation = null;
        for (Method method : methods){
            //确认方法中有一个方法，是现在真正操作的方法
            String methname = method.getName();
            if (methname.equals(methodName)){
                //得到操作这个方法的自定义的日志
                //获取自定义注解的功能
                operation = method.getAnnotation(WebLog.class).operation();
                //这个就是需要存储到数据库的操作行为
                break;
            }
        }
        RoleLog pojo = new RoleLog();
        pojo.setRoletype("user");
        pojo.setParams(params);//遍历 request中的所有
        pojo.setOperation(operation);//来源自定义的注解
        pojo.setMethod(methodName);
        pojo.setCreatetime(new Date());
        roleLogService.addLog(pojo);
    }

}
