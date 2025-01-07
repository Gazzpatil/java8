package methodconstructorreference;

import java.util.function.Supplier;

@FunctionalInterface
interface MyInterface{
	int m1(int a,int b);
}


public class Reference {
	
	public static int m2(int a,int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
//		By using lamda Expression
		/*
		 * MyInterface mi=(a,b)->{ return a+b; };
		 *  int m1 = mi.m1(10, 20);
		 * System.out.println(m1);
		 */
		
		
//		By using Method References
		/*
		 * MyInterface mi=Reference::m2; 
		 * int m1 = mi.m1(20, 10); 
		 * System.out.println(m1);
		 */
	
		Runnable run=()->{
			for(int i=1;i<=5;i++) {
				System.out.println(i);
			}
		};
		
		Thread t=new Thread(run);
		t.start();
		
	}
/*
 $$$$ METHOD REFERENCE $$$$
 
 method reference means referring to one method from another method.
 */
	
	
}
