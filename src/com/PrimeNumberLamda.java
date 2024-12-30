package com;
@FunctionalInterface
interface Prime{
	 boolean isPrime(int n);
}
public class PrimeNumberLamda {
public static void main(String[] args) {
	Prime p=n->{
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	};
	
	System.out.println(p.isPrime(57));
}
}
