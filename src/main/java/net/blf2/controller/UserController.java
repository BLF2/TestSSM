package net.blf2.controller;

import net.blf2.entity.UserInfo;
import net.blf2.service.IUserService;
import net.blf2.service.Impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by blf2 on 17-1-3.
 */
@Controller
@RequestMapping("/User")
public class UserController {
    @Resource
    private IUserService userService;

    public IUserService getUserService() {
        return userService;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/userLogin")
    public String checkUserInfo(String userId,String userPswd)
    {
        System.out.println(userId+" "+userPswd);
        UserInfo userInfo = userService.getUserInfoByUserId(userId);
        System.out.println(userInfo.getUserId()+" "+userInfo.getUserPswd());
        if(userInfo != null && userInfo.getUserPswd().equals(userPswd))
            return "successLogin";
        return "failLogin";
    }
}
