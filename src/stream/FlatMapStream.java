package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapStream {
public static void main(String[] args) {
	List<String> list1 = Arrays.asList("jaiswal","jaddu","rahul","rohit");
	List<String> list2 = Arrays.asList("konstas","cummins","steve","khawaja");
	
	List<List<String>> list = Arrays.asList(list1,list2);
	System.out.println(list);
	list.stream().flatMap(fm->fm.stream()).forEach(f->System.out.println(f));
	

}
}


