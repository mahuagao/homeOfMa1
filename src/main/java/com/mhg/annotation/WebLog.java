package com.mhg.annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface WebLog {
    //ElementType.METHOD 注解的作用范围 描述在方法上 PARAMETER参数
    String operation() default "";
}
