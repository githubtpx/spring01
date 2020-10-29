package com.atguigu.spring.di;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDI {
	
	/**
	 * Junit的Before注解的使用：对于每个测试方法都要执行一次：
	 * 每个测试方法的调用顺序：@Before  -> @Test -> @after
	 */
	private ApplicationContext ctx = null;
	
	@Before
	public void init() {
		//1. 创建IOC对象
		ctx = new ClassPathXmlApplicationContext("spring-di.xml");
	}
	

	/**
	 * 对象属性值的注入问题？使用DI
	 */
	@Test
	public void testDISet() {
		//1.创建IOC容器对象
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-di.xml");
		
		//2.获取对象
		Car car = ctx.getBean("car",Car.class); 
		System.out.println(car);
	}
	
	
	@Test
	public void testDIConstrutor() {
		//1.创建IOC容器对象
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-di.xml");
		
		
		//2.
		Car car1 = ctx.getBean("car1", Car.class);
		System.out.println(car1);
		
		
		Car car2 = ctx.getBean("car2", Car.class);
		System.out.println(car2);
		
		
	}
	
	@Test
	public void testReflect(){
		 Class clazz = Car.class;
		 Constructor[] cons = clazz.getDeclaredConstructors();
		 
		 for (Constructor conn : cons) {
			 //获取构造器参数列表
			Class[] types = conn.getParameterTypes();
			for (Class c : types) {
				System.out.print(c.getName() + " , ");
			}
			
			System.out.println();
		}
		 
		 
	}
	
	/**
	 * 测试p命名空间
	 */
	@Test
	public void testP(){
		//1.创建IOC容器对象
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-di.xml");
			
		//2.获取对象
		Car car = ctx.getBean("car3",Car.class); 
		System.out.println(car);
	}
	
	
	/**
	 * 测试字面量
	 */
	@Test
	public void testZML(){
		//1. 创建IOC对象
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-di.xml");
		
		//2.获取Book对象
		Book book = ctx.getBean("book",Book.class);
		System.out.println(book);
		
	}
	
	
	/**
	 * 测试引用bean对象
	 */
	@Test
	public void testRef(){
		//1. 创建IOC对象
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-di.xml");
		
		//2.获取Book对象
		Person person = ctx.getBean("person",Person.class);
		System.out.println(person);
	}
	
	
	
	/**
	 * 测试内部bean对象
	 */
	@Test
	public void testInnerBean() {
		Person person = ctx.getBean("person1",Person.class);
		System.out.println(person);
		
	}
	
	/**
	 * 测试null值注入
	 */
	@Test
	public void testNull() {
		Person person = ctx.getBean("person2",Person.class);
		System.out.println(person);
		
	}
	
	
	/**
	 * List属性进行值的注入问题
	 */
	@Test
	public void testList() {
		PersonList personList = ctx.getBean("personList",PersonList.class);
		System.out.println(personList);
	}
	
	 
	/**
	 * Map属性进行值的注入问题
	 */
	@Test
	public void testMap() {
		PersonMap personMap = ctx.getBean("personMap",PersonMap.class);
		System.out.println(personMap);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
