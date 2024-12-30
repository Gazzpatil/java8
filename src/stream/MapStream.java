package stream;

import java.util.Arrays;
import java.util.List;


//Print name with its length which are starting with 'A' 
public class MapStream {
public static void main(String[] args) {
List<String> list=	Arrays.asList("jadeja","yashasvi","rahul","rohit","Ajinkys"
		,"Ashwin","Anderson");
	list.stream()
	.filter(f->f.startsWith("A"))
	.map(m->m+" "+m.length())
	.forEach(f->System.out.println(f));
	
}
}
