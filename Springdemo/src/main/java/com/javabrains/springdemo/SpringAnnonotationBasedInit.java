package com.javabrains.springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class SpringAnnonotationBasedInit {

	public static void main(String[] args) {

		// Traingle traingle = new Traingle();
		// @SuppressWarnings("deprecation")
		// BeanFactory factory = new XmlBeanFactory(new
		// FileSystemResource("spring.xml"));

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringHelloWorld.xml");
		Triangle traingle = (Triangle) context.getBean("triangle");
		traingle.draw();

		
		
		ShowMessage msg = (ShowMessage) context.getBean("messageWriter");
		msg.printMessage();

	}
}
