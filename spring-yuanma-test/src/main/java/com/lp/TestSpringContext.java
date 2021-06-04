package com.lp;

import org.springframework.beans.factory.xml.XmlReaderContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: lp
 * @create: 2021-06-04 18:55
 * @description: TODO
 */
public class TestSpringContext {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-test.xml");
		UserService userService = (UserService) context.getBean("userService");
		System.out.println(userService.queryById(1L));
	}
}
