package com.rexyn.test2.service;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author sheldon
 */
//作用范围，类，方法，字段  ，所有
@Target({ElementType.TYPE})
//作用时间
@Retention(RetentionPolicy.RUNTIME)
public @interface TestAnnotationService {
    String value();
    String name();
    String path();
}
