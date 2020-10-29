package com.atguigu.spring.helloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// ��ȡ��Person����ʹ��Spring��IOC�����Ķ���		(��Ϊ���IOC�����Ѿ�������Person������)
		
		//1. ����Spring��IOC��������	(��ȡSpring�����������ļ�)
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				//����ȥѰ�ҡ���·����src��ȡxml���ļ�����Ȼ��ȥ����IOC��������(Spring������ʩ��Ӧ�õ�������)
		
		// getBean()����IOC��������BeanFactory�ӿ��ж����
		
		//2. ��ȡPerson����:
		//����һ��ͨ��bean��id
		Person person = (Person) ctx.getBean("person");
		
		//����������������ȥѰ��xml��bean��class
		//�쳣��expected single matching bean but found 2: person,person1
		//Person person = ctx.getBean(Person.class);
		
		//��ʽ��������Ҫǿת
		Person person1 = ctx.getBean("person1",Person.class);
		
		//3. ���÷���
		person.sayHello();
		person1.sayHello();
				
				
	}
		
		
		
		
}
