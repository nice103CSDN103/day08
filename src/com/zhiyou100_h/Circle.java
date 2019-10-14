package com.zhiyou100_h;

public class Circle extends Shape{
	private double R;
	public Circle() {}
	public Circle(double r) {
		this.R = r;
	}
	public void perimeter() {
		System.out.println("这是Circle求周长的方法, 结果为 : "+2 * 3.14 * R);
	}
	public void area() {
		System.out.println("这是Circle求面积的方法, 结果为 : "+ 3.14 * R * R);
	}
}
