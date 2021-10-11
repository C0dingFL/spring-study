package com.fenglei.spring5.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author fenglei
 * @version 1.0
 * @description: TODO
 * @time 2021/10/9 8:43 下午
 */
@Component
@Aspect
@Order(1)
public class PersonProxy {
}
