package com.atguigu.spring.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.spring.di.Car;

public class Main {
	public static void main(String[] args) {
		
		//1. ʵ����IOC��������
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-factorybean.xml");
		
		//2. ��ȡ����
		Car car = ctx.getBean("car",Car.class);
		System.out.println(car);
		
		
	}
}
