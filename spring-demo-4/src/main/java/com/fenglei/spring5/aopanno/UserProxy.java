package com.fenglei.spring5.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author fenglei
 * @version 1.0
 * @description: TODO
 * @time 2021/10/9 7:25 下午
 */

@Aspect
@Component
public class UserProxy {
    //相同切入点抽取
    @Pointcut(value = "execution(* com.fenglei.spring5.aopanno.User.add(..))")
    public void pointdemo(){
    }
    /**
     * 前置通知
     */
    @Before(value = "pointdemo()")
    public void before(){
        System.out.println("before.....");
    }
    //后置通知
    @AfterReturning(value = "execution(* com.fenglei.spring5.aopanno.User.add(..))")
    public void afterReturning(){
        System.out.println("afterReturning....");
    }
    //异常通知
    @AfterThrowing(value = "execution(* com.fenglei.spring5.aopanno.User.add(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing....");
    }
    //最终通知
    @After(value = "execution(* com.fenglei.spring5.aopanno.User.add(..))")
    public void after(){
        System.out.println("after....");
    }

    /**
     * 环绕通知
     */
    @Around(value = "execution(* com.fenglei.spring5.aopanno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前");
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后");
    }

}
