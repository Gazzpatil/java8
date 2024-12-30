package com;

interface Emp{
	public String work();
}

public class Employee {
public static void main(String[] args) {
	int a=1000;
	Emp e=()->{
		System.out.println("hello hi " +a );
		return  "invoked";
	};
	e.work();
}
}
