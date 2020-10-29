package com.atguigu.spring.helloWorld;

/**
 * 现在我有个类Person，把这个类Person交给Spring的IOC容器来管理，然后找这个容器要这个对象
 * @author home
 *
 */
public class Person {
	
	private String name;	//成员变量
	

	public Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName2(String name) {  //set后面的才叫属性 --反射
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
	//自定义方法
	public void sayHello() {
		System.out.println("我的名字是："+ name);
	}
	
}
