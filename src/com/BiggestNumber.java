package com;
@FunctionalInterface
interface Biggest{
	int big(int[] arr);
}


public class BiggestNumber {
public static void main(String[] args) {
	Biggest b=(int[] arr)->{
		int big=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>big) {
				big=arr[i];
			}
		}
		return big;
	};
	int[] ar= {10,30,40,56,3,1,90};
	int bb=b.big(ar);
	System.out.println(bb);
}
}
