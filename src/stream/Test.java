package stream;

import java.util.Arrays;
import java.util.List;

public class Test {
public static void main(String[] args) {
	User u1=new User(19,"konstas");
	User u2=new User(19,"steve");
	User u3=new User(23,"smith");
	User u4=new User(17,"somesh");
	User u5=new User(11,"patil");
	List<User> asList = Arrays.asList(u1,u2,u3,u4,u5);
	asList.stream().filter(p->p.age>18 && p.name.startsWith("s")).forEach(f->System.out.println(f.name));
	
}
}

class User{
	int age;
	String name;
	
	public User(int age,String name) {
		this.age=age;
		this.name=name;
	}
	
}