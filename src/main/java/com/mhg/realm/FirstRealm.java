package com.mhg.realm;

import com.mhg.dao.AuthFunctionMapper;
import com.mhg.dao.RoleTableMapper;
import com.mhg.dao.SystemUserMapper;
import com.mhg.pojo.SystemUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FirstRealm extends AuthorizingRealm {

    //依赖用户表持久层
    @Autowired
    private SystemUserMapper systemUserMapper;
    //依赖角色表持久层
    @Autowired
    private RoleTableMapper roleTableMapper;
    //依赖权限表持久层
    @Autowired
    private AuthFunctionMapper authFunctionMapper;


    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        Session session = SecurityUtils.getSubject().getSession();
        //获取当前用户
        SystemUser systemUser = (SystemUser) session.getAttribute("user");
        //根据获取该用户的角色id
        long roleid = systemUser.getRoleid();
        //调用持久层获取角色类型
        String roletype = roleTableMapper.findtypyById(roleid);
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        //设置角色
        info.addRole(roletype);
        //权限结果集
        List<String> functionList = null;
        //调用持久层查询当前用户权限
        if ("admin".equals(roletype)) //如果是管理员，获取所有权限
        {
            functionList = authFunctionMapper.findAll();
        }else{        //普通用户只有查询的权限
            functionList = authFunctionMapper.findOne();
        }
        //遍历结果集授权
        for (String authrity : functionList){
            info.addStringPermission(authrity);
        }
        return info;
    }

    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //获取令牌（里面存放new UsernamePasswordToken）
        UsernamePasswordToken usertoken = (UsernamePasswordToken) authenticationToken;
        //得到账号和密码
        String username = usertoken.getUsername();
        //调用持久层方法，去查询用户名是否存在，如果存在返回对象（账号和密码都有的对象）
        SystemUser systemUser = systemUserMapper.findByusername(username);
        if (systemUser!=null) {
            //参数1，用户认证的对象（subject.getPrincipal();返回的对象）
            //参数2，从数据库根据用户名查询到的用户的密码
            //参数3，把当前自定义的realm对象传给SimpleAuthenticationInfo,在配置文件中注入
            AuthenticationInfo info = new SimpleAuthenticationInfo(systemUser, systemUser.getPassword(), this.getName());
            //设置参数
            Session session = SecurityUtils.getSubject().getSession();
            session.setAttribute("user",systemUser);
            return info;
        }else{
            return null;
        }
    }
}
