package com.lmy.springboot.modules.langplugin.bean;

import com.github.dozermapper.core.Mapping;
import lombok.Data;

import java.util.Date;

/**
 * @ProjectName: springboot
 * @Package: com.lmy.springboot.modules.langplugin.bean
 * @ClassName: Staff
 * @Description:
 * @Author: linmy
 * @Date: 2020/5/7
 * @Version: 1.0
 */
@Data
public class Staff {

    /** option：是否可选，默认必填，一般改成true可选，否则映射map时不匹配会报错 */
    @Mapping(value = "name", optional = true)
    private String name2 ;
    private String age ;

    @Mapping(value = "birthday", optional = true)
    private Date staffBirthday ;

}
