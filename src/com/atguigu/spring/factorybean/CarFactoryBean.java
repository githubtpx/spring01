package com.atguigu.spring.factorybean;

import org.springframework.beans.factory.FactoryBean;

import com.atguigu.spring.di.Car;
/**
 * FactoryBean����Spring֧�� ���ǲ��뵽����bean���󴴽��Ĺ�����һ�ַ�ʽ��
 * 		1. ֮ǰ���󴴽�����Springͨ�����䣬ͨ���޲������������в����Ĺ�������������ġ�
 * 		2. ����Bean����Ĵ����������Լ�ȥд�ġ�
 * 
 */
public class CarFactoryBean implements FactoryBean<Car>{

	/**
	 * ����bean�����崴����bean��������getObject���������صġ�
	 */
	@Override
	public Car getObject() throws Exception {
		return new Car("������","����",500000);
	}

	
	
	
	/**
	 * ���ؾ���bean��������ͣ����ҵ�ǰ�Ĺ���Bean���׸��㴴��ʲô���͵�bean�����أ���
	 */
	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}
	
	/**
	 * bean	�����ǵ����ģ�Ҳ������ԭ�͵�(�ǵ���)�����潲bean�����������о�
	 */
	@Override
	public boolean isSingleton() {
		return true;
	}
	
	
	
	
	

}
