package function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class Student{
	int id;
	String name;
	int sal;
	Student(int id,String name,int sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
}

public class Demo {
	public static void main(String[] args) {
		
		Student s1=new Student(1,"varun",5000);
		Student s2=new Student(2,"aaruna",4000);
		Student s3=new Student(3,"dheeraja",3000);
		Student s4=new Student(4,"rajakumara",10000);
		
		List<Student> list=Arrays.asList(s1,s2,s3,s4);
		
		Function<Integer,Integer> f=n->n*n;
//		System.out.println(f.apply(10));
		
		Function<String,Integer> fun=n->n.length();
//		System.out.println(fun.apply("gazz"));
//		System.out.println(fun.apply("gazz patil"));
		
		Function<Student,Integer> fu=s->{
			int sal=s.sal;
			if(sal>2000 && sal<4000)
				return sal*10/100;
			else
				return sal*20/100;
		};
		
		for(Student s:list) {
			int bonus=fu.apply(s);
			System.out.println(s.name +" "+s.sal);
			System.out.println(bonus);
		}
	}
}
