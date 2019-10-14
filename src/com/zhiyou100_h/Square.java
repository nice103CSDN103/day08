package com.zhiyou100_h;

public class Square extends Rect {
	private double L;
	public Square() {}
	public Square(double l) {
		this.L = l;
	}
	public void perimeter() {
		System.out.println("这是Square求周长的方法, 结果是 :"+4 * L);
	}
	public void area() {
		System.out.println("这是Square求面积的方法, 结果是 :"+L * L);
	}
}
