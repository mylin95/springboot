package com.lmy.springboot.modules.jpa.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @ProjectName: springboot
 * @Package: com.lmy.springboot.modules.db.domain
 * @ClassName: User
 * @Description:
 * @Author: linmy
 * @Version: 1.0
 */
@Data
@Entity
@Table(name = "user")
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 261301597599379330L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "user_id")
    @ApiModelProperty("主键")
    private Long userId;
    @ApiModelProperty("用户名")
    private String username;
    @ApiModelProperty("年龄")
    @Column(name = "age")
    private Integer userAge;
    @ApiModelProperty("密码")
    private String password;
    @Transient
    @ApiModelProperty("身高（cm）,jpa忽略字段")
    private Integer height;
    @Transient
    @ApiModelProperty("体重（kg）,jpa忽略字段")
    private Integer weight;


}
