package com.zhiyou100_h;

public class Rect extends Shape {
	private double L;
	private double W;
	public Rect() {}
	public Rect(double l , double w) {
		this.L = l;
		this.W = w;
	}
	public void perimeter() {
		System.out.println("这是Rect求周长的方法,结果 :"+2 * (L + W));
	}
	public void area() {
		System.out.println("这是Rect求面积的方法,结果 :"+ L * W);
	}
}
