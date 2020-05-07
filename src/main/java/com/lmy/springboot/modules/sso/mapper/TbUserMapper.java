package com.lmy.springboot.modules.sso.mapper;

import com.lmy.springboot.modules.sso.domain.TbUser;
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
// @MyBatisRepository
@Repository
public interface TbUserMapper {

    TbUser getUserInfoById(@Param("userId") String userId);

    TbUser getUserInfoByUsername(@Param("username") String username);

    TbUser getUserInfoByUser(TbUser tbUser);

    List<TbUser> getUserInfoList();
}
