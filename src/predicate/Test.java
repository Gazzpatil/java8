package predicate;

/**
 * Predicate is a type of functional interface, which consist of one abstract  method called as test, and its return type is boolean.
 *
 */
import java.util.function.*;





public class Test {
	
	
	
	public static void main(String[] args) {
//		Predicate<String> p=i->(i.length()>10);
//		String[] name= {"mohan","rohann","petter","john","pakemon"};
		
//		System.out.println(p.test("hello"));
//		for(String n:name) {
//		if(p.test(n)) {
//			System.out.println(n);
//		}
//		}
		
		
//		Ex2 : check the length of given string is greater than 4 or not.
		
Predicate<String> pr=(String s)->(s.length()>5);
System.out.println(pr.test("rajvi"));
String[] name= {"mohan","rohann","petter","john","pokemon"};

for(String n:name) {
	if(pr.test(n)) {
		System.out.println(n);
	}
}
		
	}
	
	
}


