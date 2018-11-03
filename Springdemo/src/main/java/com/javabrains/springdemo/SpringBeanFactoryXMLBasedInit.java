package com.javabrains.springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class SpringBeanFactoryXMLBasedInit {

	public static void main(String[] args) {

		// Traingle traingle = new Traingle();
		@SuppressWarnings("deprecation")
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource(".\\resources\\SpringHelloWorld.xml"));
		System.out.println("This is Beanfactory Demo!!");
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("SpringHelloWorld.xml");
		Triangle traingle = (Triangle) factory.getBean("triangle");
		traingle.draw();

		ShowMessage msg = (ShowMessage) factory.getBean("messageWriter");
		msg.printMessage();

	}
}
