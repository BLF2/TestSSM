package net.blf2.service.Impl;

import net.blf2.dao.IUserDao;
import net.blf2.entity.UserInfo;
import net.blf2.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by blf2 on 17-1-3.
 */
@Service("UserServiceImpl")
public class UserServiceImpl implements IUserService{
    @Resource
    private IUserDao userDao;

    public IUserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    public UserInfo getUserInfoByUserId(String userId) {
        return userDao.readUserInfoByUserId(userId);
    }
}
