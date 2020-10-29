package com.atguigu.spring.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.spring.di.Car;

public class Main {
	public static void main(String[] args) {
		
		//1. 实例化IOC容器对象
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-factorybean.xml");
		
		//2. 获取对象
		Car car = ctx.getBean("car",Car.class);
		System.out.println(car);
		
		
	}
}
