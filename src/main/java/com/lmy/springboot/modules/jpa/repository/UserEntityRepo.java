package com.lmy.springboot.modules.jpa.repository;

import com.lmy.springboot.modules.jpa.domain.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @Desc
 * @Author linmy
 * @Date 2020-06-16
 */
@Repository
@Component
public interface UserEntityRepo extends JpaRepository<UserEntity,Long> {

}
