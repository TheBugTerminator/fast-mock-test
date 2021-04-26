/*
 * wiki.primo
 * Copyright (C) 2013-2020 All Rights Reserved.
 */
package fast.mock.test.core.json;

import fast.mock.test.core.enums.JsonConfigListScopeEnum;
import lombok.Data;

/**
 * 配置
 * @author chenhx
 * @version 0.0.1 2020-05-08 15:48
 */
@Data
public class JsonConfigList {

    /**
     * 作用域：全局（global）、包（package）、类（class）、方法（method） - 默认全局
     */
    private String scope = JsonConfigListScopeEnum.GLOBAL.getValue();

    /**
     * 作用域的值，global则无需配置该值，package则为包名，class则为类名，method则为方法名
     */
    private String scopeValue;

    /**
     * 类型的全限定名称
     */
    private String fullyType;

    /**
     * 类型的值
     */
    private String value;


}
