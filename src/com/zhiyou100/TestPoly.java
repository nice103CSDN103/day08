package com.zhiyou100;

public class TestPoly {

	public static void main(String[] args) {
// -------------------没有多态-------------
		// 创建狗类对象
		Dog d1 = new Dog();
		d1.eat();
		
		Cat c1 = new Cat();
		c1.eat();
		System.out.println("-----------");
		Dog d2 = new Dog();
		Animal a2;
		a2 = d2;
		Animal a3 = new Dog();
		
		// 使用父类引用调用eat方法
		
		a3.eat();
		
		Animal a4 = new Cat();
		a4.eat();
		
		
		
	}

}
