package com.fenglei.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author fenglei
 * @version 1.0
 * @description: TODO
 * @time 2021/10/9 8:51 下午
 */
@Configuration
@ComponentScan(basePackages = "com.fenglei")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {
}
