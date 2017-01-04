package net.blf2.dao;

import net.blf2.entity.UserInfo;
import org.apache.ibatis.annotations.Param;

/**
 * Created by blf2 on 17-1-3.
 */
public interface IUserDao {
    public UserInfo readUserInfoByUserId(@Param("userId")String userId);
}
