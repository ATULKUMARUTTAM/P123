package org.atuluttam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        ApplicationContext ctx =  new ClassPathXmlApplicationContext("config.xml");
        Student s = (Student) ctx.getBean("student");
        s.doAssignment();

        Student s1 = (Student) ctx.getBean("student");
        s1.doAssignment();
    }
}