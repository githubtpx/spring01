package com.atguigu.spring.helloWorld;

/**
 * �������и���Person���������Person����Spring��IOC����������Ȼ�����������Ҫ�������
 * @author home
 *
 */
public class Person {
	
	private String name;	//��Ա����
	

	public Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName2(String name) {  //set����ĲŽ����� --����
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
	//�Զ��巽��
	public void sayHello() {
		System.out.println("�ҵ������ǣ�"+ name);
	}
	
}
