package com.example.springboot.utils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解
 * 参数不能为空的注解
 */
@Target(ElementType.PARAMETER)//表示该注解作用于方法参数上
@Retention(RetentionPolicy.RUNTIME)
public @interface ParamCheck {
    /**
     * 是否为空，默认不能为空
     */
    boolean notNull() default true;

}
