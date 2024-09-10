package com.hexaware.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	//ApplicationContext ctx=new ClassPathXmlApplicationContext("com/hexaware/spring/Hello.xml");
	 ApplicationContext context = new ClassPathXmlApplicationContext("com/hexaware/spring/Hello.xml");
    HelloImpl impl=(HelloImpl)context.getBean("bean1");
	impl.Disp();
}
}
