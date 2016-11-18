package com.spring;


import com.spring.configuration.KnightQuestConfig;
import com.spring.knights.Knight;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    //page 15
    public static void main(String[] params) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KnightQuestConfig.class);
        Knight knight = (Knight) context.getBean("braveKnight"); //or Knight.class
        knight.embark();
        System.out.println("the end");
    }
}