package com.atguigu.spring.di;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDI {
	
	/**
	 * Junit��Beforeע���ʹ�ã�����ÿ�����Է�����Ҫִ��һ�Σ�
	 * ÿ�����Է����ĵ���˳��@Before  -> @Test -> @after
	 */
	private ApplicationContext ctx = null;
	
	@Before
	public void init() {
		//1. ����IOC����
		ctx = new ClassPathXmlApplicationContext("spring-di.xml");
	}
	

	/**
	 * ��������ֵ��ע�����⣿ʹ��DI
	 */
	@Test
	public void testDISet() {
		//1.����IOC��������
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-di.xml");
		
		//2.��ȡ����
		Car car = ctx.getBean("car",Car.class); 
		System.out.println(car);
	}
	
	
	@Test
	public void testDIConstrutor() {
		//1.����IOC��������
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
			 //��ȡ�����������б�
			Class[] types = conn.getParameterTypes();
			for (Class c : types) {
				System.out.print(c.getName() + " , ");
			}
			
			System.out.println();
		}
		 
		 
	}
	
	/**
	 * ����p�����ռ�
	 */
	@Test
	public void testP(){
		//1.����IOC��������
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-di.xml");
			
		//2.��ȡ����
		Car car = ctx.getBean("car3",Car.class); 
		System.out.println(car);
	}
	
	
	/**
	 * ����������
	 */
	@Test
	public void testZML(){
		//1. ����IOC����
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-di.xml");
		
		//2.��ȡBook����
		Book book = ctx.getBean("book",Book.class);
		System.out.println(book);
		
	}
	
	
	/**
	 * ��������bean����
	 */
	@Test
	public void testRef(){
		//1. ����IOC����
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-di.xml");
		
		//2.��ȡBook����
		Person person = ctx.getBean("person",Person.class);
		System.out.println(person);
	}
	
	
	
	/**
	 * �����ڲ�bean����
	 */
	@Test
	public void testInnerBean() {
		Person person = ctx.getBean("person1",Person.class);
		System.out.println(person);
		
	}
	
	/**
	 * ����nullֵע��
	 */
	@Test
	public void testNull() {
		Person person = ctx.getBean("person2",Person.class);
		System.out.println(person);
		
	}
	
	
	/**
	 * List���Խ���ֵ��ע������
	 */
	@Test
	public void testList() {
		PersonList personList = ctx.getBean("personList",PersonList.class);
		System.out.println(personList);
	}
	
	 
	/**
	 * Map���Խ���ֵ��ע������
	 */
	@Test
	public void testMap() {
		PersonMap personMap = ctx.getBean("personMap",PersonMap.class);
		System.out.println(personMap);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
