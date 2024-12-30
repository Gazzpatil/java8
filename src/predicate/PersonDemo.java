package predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Person {
	 int age;
	 String name;
	 String dept;
	
	public Person(int age,String name,String dept) {
		this.age=age;
		this.name=name;
		this.dept=dept;
	}	
}

public class PersonDemo{
	public static void main(String[] args) {
		Person p1=new Person(23,"ravi","it");
		Person p2=new Person(24,"konstans","devops");
		Person p3=new Person(30,"lyon","it");
		Person p4=new Person(28,"cummins","it");
		
		List<Person> persons = Arrays.asList(p1,p2,p3,p4);
		
		Predicate<Person> predicate1=(p)->p.age>=18;
		
		Predicate<Person> predicate2=(p)->p.dept.equals("it");
		
		//predicate joining
		Predicate<Person> p=predicate1.or(predicate2);
		
		for (Person person : persons) {
			if(p.test(person)) {
				System.out.println("name :"+person.name);
			}
		}
		
	}
}


