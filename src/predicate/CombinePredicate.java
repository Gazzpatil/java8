package predicate;

import java.util.function.Predicate;

public class CombinePredicate {
public static void main(String[] args) {
	int[] arr= {5,15,20,25,30,35,40,45,50,55,60,70,75,66,78};
	
	Predicate<Integer> p1=i->i%2==0;
	Predicate<Integer> p2=i->i>50;
//	and 
	
	for(int n:arr) {
		if(p1.negate().test(n)) {
			System.out.print(n+" ");
		}
	}
	
	
}
}
