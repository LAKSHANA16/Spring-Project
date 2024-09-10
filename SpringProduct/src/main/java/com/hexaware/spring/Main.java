package com.hexaware.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("com/hexaware/spring/Product.xml");
	Inventory inv=(Inventory)ctx.getBean("inventory1");
	inv.displayInfo();
}
}
