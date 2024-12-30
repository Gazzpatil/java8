package lamda;

import java.util.function.Predicate;

public class DemoLamda {
public static void main(String[] args) {
	
	String [] str= {"Asd","Asd","jhdf","poate"};
	
	Predicate<String> p=name->name.startsWith("A");
	
	
	
	for(String s:str) {
		if(p.test(s)) {
			System.out.println(s);
		}
	}
	
	
	
	
}
}
