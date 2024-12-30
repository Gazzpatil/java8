package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

//Using Stream api group employee with respect to Country
public class GroupBy {
	public static void main(String[] args) {
		Employe e1=new Employe(1,"lyon",13000,"Aus");
		Employe e2=new Employe(2,"khwaja",13000,"Aus");
		Employe e3=new Employe(3,"Jaiswal",15000,"Ind");
		Employe e4=new Employe(4,"pant",112000,"Ind");
	List<Employe> list=Arrays.asList(e1,e2,e3,e4);
	
	Map<String, List<Employe>> collect = list.stream().collect(Collectors.groupingBy(f->f.country));
	System.out.println(collect);
	
	Optional<Employe> collect2 = list.stream().collect(Collectors.maxBy(Comparator.comparing(s->s.salary)));
	if(collect2.isPresent()) {
		System.out.println(collect2.get());
	}
	
	list.stream().parallel().forEach(e->System.out.println(e+" "+Thread.currentThread()));;
	
	
	}
}

class Employe{
	int id;
	String name;
	double salary;
	String country;
	public Employe(int id,String name,double salary, String country) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.country=country;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", country=" + country + "]";
	}
	
	
}