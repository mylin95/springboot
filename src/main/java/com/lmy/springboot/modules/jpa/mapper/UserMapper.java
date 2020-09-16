package com.lmy.springboot.modules.jpa.mapper;

import com.lmy.springboot.base.mybatis.MyBatisRepository;
import com.lmy.springboot.modules.jpa.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

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
@MyBatisRepository
@Repository
    // @Mapper
public interface UserMapper {

    User getUserInfoById(@Param("userId") String userId);

    List<User> getUserInfoList();

}
