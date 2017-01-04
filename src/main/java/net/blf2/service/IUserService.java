package net.blf2.service;

import net.blf2.entity.UserInfo;

/**
 * Created by blf2 on 17-1-3.
 */
public interface IUserService {
    public UserInfo getUserInfoByUserId(String UserId);
}
