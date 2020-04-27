package com.smart.editor;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//To test custom editor
public class CustomEditorTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:smart-context.xml");
        Boss boss = context.getBean("boss",Boss.class);
        System.out.println(boss.getCar().getBrand());
        System.out.println(boss.getCar().getColor());
        System.out.println(boss.getCar().getMaxSpeed());

    }
}
