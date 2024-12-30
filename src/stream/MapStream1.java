package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
//Get Emp Name and Emp age whose salary is >= 50000
public class MapStream1 {
public static void main(String[] args) {
	Employee e1=new Employee("sunil",24,29000);
	Employee e2=new Employee("Andrew",30,30000);
	Employee e3=new Employee("Konston",29,51000);
	Employee e4=new Employee("petterson",30,55500);
	
	List<Employee> list= Arrays.asList(e1,e2,e3,e4);
	/*
	 * list.stream() .filter(f->f.salary>50000) .map(m->m.name+" "+m.age)
	 * .forEach(f->System.out.println(f));
	 */
	
//	To find Maximum salary 
	Optional<Employee> collect = list.stream().collect(Collectors.maxBy(Comparator.comparing(e->e.salary)));
	if(collect.isPresent())
		System.out.println(collect.get());
	
//  To find minimum salary 
	Optional<Employee> collect2 = list.stream().collect(Collectors.minBy(Comparator.comparing(e->e.salary)));
	if(collect2.isPresent()) {
		System.out.println(collect2.get());
	}
	
//	Averaging logic using Streams
	Double collect3 = list.stream().collect(Collectors.averagingDouble(e->e.salary));
	System.out.println(collect3);
	
}
}


class Employee{
	String name;
	int age;
	double salary;
	
	public Employee(String name,int age,double salary) {
		this.name=name;
		this.age=age;
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
	
}