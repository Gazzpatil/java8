package stringjoiner;

import java.util.StringJoiner;

public class Demo1 {
public static void main(String[] args) {
	StringJoiner sj=new StringJoiner("-");
	sj.add("hello");
	sj.add("hi");
	System.err.println(sj);
	
	StringJoiner s=new StringJoiner(",","{","}");
	s.add("jimkin");
	s.add("admin server");
	s.add("api gateway");
	System.out.println(s);
	
	
}
}
//output
//hello-hi
//{jimkin,admin server,api gateway}