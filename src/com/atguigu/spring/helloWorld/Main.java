package com.atguigu.spring.helloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// 获取到Person对象：使用Spring的IOC容器的对象		(因为这个IOC对象已经管理了Person对象了)
		
		//1. 创建Spring的IOC容器对象	(读取Spring创建的配置文件)
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				//根据去寻找“类路径下src读取xml的文件”，然后去创建IOC容器对象(Spring基础设施，应用的上下文)
		
		// getBean()是在IOC容器最顶层的BeanFactory接口中定义的
		
		//2. 获取Person对象:
		//方法一：通过bean的id
		Person person = (Person) ctx.getBean("person");
		
		//方法二：根据类型去寻找xml中bean的class
		//异常：expected single matching bean but found 2: person,person1
		//Person person = ctx.getBean(Person.class);
		
		//方式三：不需要强转
		Person person1 = ctx.getBean("person1",Person.class);
		
		//3. 调用方法
		person.sayHello();
		person1.sayHello();
				
				
	}
		
		
		
		
}
