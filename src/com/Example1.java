package com;
@FunctionalInterface
interface Drawable{
	public String draw();
}


public class Example1 {
	public static void main(String[] args) {
		int width=20;
		Drawable d=()->{System.out.println("width is "+width);
		return "finished";
		};
		System.out.println(d.draw());
	}
}
