package com.atguigu.spring.di;

public class Car {
	private String brand;	// Ʒ��
	private String crop;	// ����
	private Double price;	// �۸�	
	
	private Integer speed;  // �ٶ�

	public Car() {
		super();
	}
	

	public Car(String brand, String crop, Double price) {
		super();
		this.brand = brand;
		this.crop = crop;
		this.price = price;
	}
	

	public Car(String brand, String crop, Integer speed) {
		super();
		this.brand = brand;
		this.crop = crop;
		this.speed = speed;
	}

	
	
	

	public String getBrand() {
		return brand;
	}

	
	public void setBrand(String brand) {
		System.out.println("setBrand��" + brand);
		this.brand = brand;
	}
	public String getCrop() {
		return crop;
	}
	public void setCrop(String crop) {
		System.out.println("setCrop��" + crop);
		this.crop = crop;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		System.out.println("setPrice��" + price);
		this.price = price;
	}
	

	public Integer getSpeed() {
		return speed;
	}


	public void setSpeed(Integer speed) {
		System.out.println("setSpeed��" + speed);
		this.speed = speed;
	}


	@Override
	public String toString() {
		return "Car [brand=" + brand + ", crop=" + crop + ", price=" + price + ", speed=" + speed + "]";
	}
	
	
	
	
	
}
