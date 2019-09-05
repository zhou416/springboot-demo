package com.wjs.springbootdemo.controller;

import com.wjs.springbootdemo.domain.User;
import com.wjs.springbootdemo.service.PermissionService;
import com.wjs.springbootdemo.service.RoleService;
import com.wjs.springbootdemo.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShiroController {
    @Autowired
    private UserService us;
    @Autowired
    private RoleService rs;
    @Autowired
    private PermissionService ps;

    @RequestMapping("/loginShiro/{username}/{password}")
    public Object loginShiro(@PathVariable String username,@PathVariable String password){
        if(username != null){
            User user = us.selectByName(username);
            if(user !=null && user.getPassword().equals(password)){
                //添加用户认证信息
                Subject subject = SecurityUtils.getSubject();
                UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(username,password);
                //进行验证，这里可以捕获异常，然后返回对应信息
                subject.login(usernamePasswordToken);
                System.out.print("loginShiro："+usernamePasswordToken);
                return "loginShiro";
            }
        }
        //调用过logout后通过setLoginUrl重新进入该方法
        return "it is logout";
    }
    @RequestMapping("/logout")
    public String logout(){
        System.out.print("logout");
        return "logout";
    }
    @RequestMapping("/index")
    public String index(){
        System.out.print("index");
        return "index";
    }
    @RequestMapping("/errorpage")
    public String errorpage(){
        System.out.print("errorpage");
        return "errorpage";
    }
    @RequestMapping("/testShiro/{test}")
    public String testShiro(@PathVariable String test){
        System.out.print("testShiro");
        return "testShiro:success";
    }
    //认证角色
    @RequestMapping("/testAuthorityRole")
    @RequiresRoles(value={"admin"})
    public String testAuthorityRole(){
        System.out.print("testAuthorityRole");
        return "testAuthorityRole:success";
    }
    //认证权限
    @RequestMapping("/testAuthorityPermission")
    @RequiresPermissions(value={"打酱油"})
    public String testAuthorityPermission(){
        System.out.print("testAuthorityPermission");
        return "testAuthorityPermission:success";
    }
}
