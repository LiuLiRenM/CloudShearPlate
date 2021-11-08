package com.liuliren.cloudshearplate.modules.auth.utils;

import javax.annotation.Nullable;
import java.util.Objects;

/**
 * 工具集
 *
 * @author LiuYaoWen
 * @date 2021/11/8 下午6:56
 */
public class Func {

    public Func() {

    }

    /**
     * 判断对象是否不为NULL，不为NULL返回true，为NULL返回false
     *
     * @param obj 对象
     * @return boolean 是否不为NULL
     * @author LiuYaoWen
     * @date 2021/11/8 下午6:59
     */
    public static boolean notNull(@Nullable Object obj) {
        return Objects.nonNull(obj);
    }

    /**
     * 判断对象是否为NULL，为NULL返回true，不是NULL返回false
     *
     * @param obj 对象
     * @return boolean 是否为NULL
     * @author LiuYaoWen
     * @date 2021/11/8 下午7:01
     */
    public static boolean isNull(@Nullable Object obj) {
        return Objects.isNull(obj);
    }
}
