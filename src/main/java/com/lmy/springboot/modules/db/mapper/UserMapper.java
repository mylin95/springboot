package com.lmy.springboot.modules.db.mapper;

import com.lmy.springboot.modules.db.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ProjectName: springboot
 * @Package: com.lmy.springboot.modules.db.mapper
 * @ClassName: UserMapper
 * @Description:
 * @Author: linmy
 * @Date: 2020/3/19
 * @Version: 1.0
 */
@MyBatisRespority
public interface UserMapper {

    User getUserInfoById(@Param("userId") String userId);

    List<User> getUserInfoList();
}
