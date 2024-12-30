package predicate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee{
	int exp;
	String name;
	int sal;
	Employee(int exp,String name,int sal){
		this.exp=exp;
		this.name=name;
		this.sal=sal;
	}
	@Override
	public String toString() {
		return "Employee [exp=" + exp + ", name=" + name + ", sal=" + sal + "]";
	}
	
}


public class Demo1 {
	
	public static void main(String[] args) {
		Employee e1=new Employee(2,"jhonny",20000);
		Employee e2=new Employee(3,"mustafizur",30000);
		Employee e3=new Employee(4,"Raina",40000);
		Employee e4=new Employee(6,"bravo",45000);
		Predicate<Employee> p=e->(e.exp>=4 && e.sal>30000);
		List<Employee> list=Arrays.asList(e1,e2,e3,e4);
		
		for(Employee l:list) {
			if(p.test(l)) {
			System.out.println(l);	
			}
		}
		
	}
}
