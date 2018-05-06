package com.sandeep;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.setMessage("I am edited");
        obj.getMessage();
        MyClass myClass = (MyClass) context.getBean("myClass");
        myClass.setNumber(10);
        myClass.getNumber();
        MyClassV2 myClassV2 = (MyClassV2) context.getBean("myClassV2");
        myClassV2.getNumber();
        myClassV2.getNumber2();
        context.registerShutdownHook();
    }
}
