package com.pixel.dsa.singleton;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BreakSpringSingleton {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx1 =
                new AnnotationConfigApplicationContext("com.pixel.dsa");

        AnnotationConfigApplicationContext ctx2 =
                new AnnotationConfigApplicationContext("com.pixel.dsa");

        SpringSingleton bean1 = ctx1.getBean(SpringSingleton.class);
        SpringSingleton bean2 = ctx2.getBean(SpringSingleton.class);

        System.out.println(bean1.hashCode());
        System.out.println(bean2.hashCode());
    }
}
