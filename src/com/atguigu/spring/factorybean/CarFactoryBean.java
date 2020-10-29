package com.atguigu.spring.factorybean;

import org.springframework.beans.factory.FactoryBean;

import com.atguigu.spring.di.Car;
/**
 * FactoryBean这是Spring支持 我们参与到具体bean对象创建的过程中一种方式。
 * 		1. 之前对象创建都是Spring通过反射，通过无参数构造器或有参数的构造器创建对象的。
 * 		2. 现在Bean对象的创建是我们自己去写的。
 * 
 */
public class CarFactoryBean implements FactoryBean<Car>{

	/**
	 * 工厂bean：具体创建的bean对象是由getObject方法来返回的。
	 */
	@Override
	public Car getObject() throws Exception {
		return new Car("五菱宏光","五菱",500000);
	}

	
	
	
	/**
	 * 返回具体bean对象的类型（即我当前的工厂Bean到底给你创建什么类型的bean对象呢？）
	 */
	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}
	
	/**
	 * bean	可以是单例的，也可以是原型的(非单例)：后面讲bean的作用域再研究
	 */
	@Override
	public boolean isSingleton() {
		return true;
	}
	
	
	
	
	

}
