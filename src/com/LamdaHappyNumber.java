package com;

@FunctionalInterface
interface HappyNumber{
	boolean isHappy(int n);
}
public class LamdaHappyNumber {
	public static void main(String[] args) {
		HappyNumber h=n->{
			while(n>9) {
				int sum=0;
				do {
					int d=n%10;
					sum=sum+d*d;
				n=n/10;
				}while(n!=0);
				n=sum;
			}
			return n==1 || n==7;	
		};
		System.out.println(h.isHappy(7));
	}
}
