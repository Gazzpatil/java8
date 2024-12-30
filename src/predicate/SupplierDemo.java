package predicate;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class SupplierDemo {
public static void main(String[] args) {
	
	Supplier supplier=()->
	{
		String otp="";
		for(int i=1;i<=5;i++) {
			otp=otp+ (int)(Math.random() *10);
		}
		return otp;
	};
	
	BiFunction<Integer, Integer, Integer> bifun=(num1,num2)->{
		int sum=num1+num2;
		return sum;
	};
	
	System.out.println(supplier.get());
	System.out.println(supplier.get());
	System.out.println(supplier.get());
	
	System.out.println("the function value is: "+bifun.apply(20, 1));

	
	
}
}
