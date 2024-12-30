package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamInterview {
	public static void main(String[] args) {
		Emp e1 = new Emp(1, "Jhansi", 32, "Female", "Hr", 2011, 25000.0);
		Emp e2 = new Emp(2, "Smith", 25, "Male", "Sales", 2015, 13500);
		Emp e3 = new Emp(3, "David", 29, "Male", "Infrastructure", 2012, 18000);
		Emp e4 = new Emp(4, "Orlen", 28, "Male", "Development", 2014, 32500);
		Emp e5 = new Emp(5, "Charles", 27, "Male", "Hr", 2013, 22700);
		Emp e6 = new Emp(6, "Cathy", 43, "Male", "Security", 2016, 10500);
		Emp e7 = new Emp(7, "Ramesh", 35, "Male", "Finance", 2010, 27000);
		Emp e8 = new Emp(8, "Suresh", 31, "Male", "Development", 2015, 34500);
		Emp e9 = new Emp(9, "Gita", 24, "Female", "Sales", 2016, 11500);
		Emp e10 = new Emp(10, "Mahesh", 38, "Male", "Security", 2015, 11000);
		Emp e11 = new Emp(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700);
		Emp e12 = new Emp(12, "Nithin", 25, "Male", "Development", 2016, 28000);
		Emp e13 = new Emp(13, "Swathi", 27, "Female", "Finance", 2013, 21300);
		Emp e14 = new Emp(14, "Buttler", 24, "Male", "Sales", 2017, 10700);
		Emp e15 = new Emp(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700);
		Emp e16 = new Emp(16, "Sanvi", 26, "Female", "Development", 2015, 28900);

		List<Emp> list = Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16);

//	1) How many males and female employees are present 
		/*
		 * Map<String, Long> collect =
		 * list.stream().collect(Collectors.groupingBy(g->g.gender,Collectors.counting()
		 * )); System.out.println(collect);
		 */

//	2) Print the name of all departments in the organization?
		/*
		 * list.stream().map(m->m.department).distinct().forEach(f->System.out.println(f
		 * ));
		 */

//	3) what is the average age of male and female employees

		/*
		 * Map<String, Double> collect =
		 * list.stream().collect(Collectors.groupingBy(g->g.gender,Collectors.
		 * averagingInt(a->a.age))); System.out.println(collect);
		 */

//	4)Get the details of heighest paid employee in the organization?

		/*
		 * Optional<Emp> collect =
		 * list.stream().collect(Collectors.maxBy(Comparator.comparing(s->s.salary
		 * +" "+s))); if(collect.isPresent()) { System.out.println(collect.get()); }
		 */

//	5)Get the names of the employee who have joined after 2015

		
		/*
		 * List<String> collect =
		 * list.stream().filter(f->f.yearOfJoining>2015).map(m->m.name).collect(
		 * Collectors.toList()); System.out.println(collect);
		 */
		
		
// 6)Find the number of empoyees in each department
		
		/*
		 * Map<String, Long> collect =
		 * list.stream().collect(Collectors.groupingBy(g->g.department,Collectors.
		 * counting())); System.out.println(collect);
		 */
		
//  7) What is the average salary in each department
		
		/*
		 * Map<String, Double> collect = list.stream()
		 * .collect(Collectors.groupingBy(g->g.department,Collectors.averagingDouble(d->
		 * d.salary))); System.out.println(collect);
		 */
		
// 8) Get the details of the youngest male employee in the Development department?
		
		/*
		 * Optional<Emp> collect = list.stream().filter(f->f.gender=="Male" &&
		 * f.department=="Development").collect(Collectors.minBy(Comparator.comparing(c-
		 * >c.age))); if(collect.isPresent()) System.out.println(collect.get()); else
		 * System.out.println("Not found!!!!!");
		 */
		
		
		
//		9)Who has the most working experience in the organisation?
		
		/*
		 * Optional<Emp> collect = list.stream() .collect(Collectors .minBy(Comparator
		 * .comparing(c->c.yearOfJoining)));
		 * 
		 * if(collect.isPresent()) System.out.println(collect.get()); else
		 * System.out.println("not present!!!!");
		 */
		
		
		
//		10)How many male and female employees are there in the sales team?
		
		/*
		 * Map<String, Long> collect = list.stream().filter(f->f.department=="Sales")
		 * .collect(Collectors.groupingBy(g->g.gender,Collectors.counting()));
		 * 
		 * System.out.println(collect);
		 */
		
//		11)What is the average salary of male and female employees?
		
		/*
		 * Map<String, Double> collect = list.stream()
		 * .collect(Collectors.groupingBy(g->g.gender,Collectors.averagingDouble(f->f.
		 * salary))); System.out.println(collect);
		 */
		
	
//		12)List down the names of all employees in each department?
		
		
		
		
		
//		13)What is the average salary and total salary of the whole organisation?
		
		
//		14)Seperate the employees who are younger or equal to 25 years from those 
//		emplyees who are older than 25 years
		
		
//	//	15)Get second highest salary from the employee
		
		Optional<Double> findFirst = list.stream().map(m->m.salary).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		if(findFirst.isPresent())
			System.out.println(findFirst.get());
		else
			System.out.println("Not Present !!!!!!!!!");
		
		
	}
}

class Emp {
	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;

	public Emp(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}

}
