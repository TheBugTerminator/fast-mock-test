/*
 * wiki.primo
 * Copyright (C) 2013-2019 All Rights Reserved.
 */
package fast.mock.test.core.dto;

import lombok.Data;

/**
 * 需要mock的类
 *
 * @author chenhx
 * @version MockClassDTO.java, v 0.1 2019-06-10 19:40 chenhx
 */
@Data
public class MockClassDTO {
    /**
     * 命名
     */
    private String name;
    /**
     * 类型
     */
    private String type;
}
