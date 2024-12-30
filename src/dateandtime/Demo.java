package dateandtime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

public class Demo {
public static void main(String[] args) throws ParseException {
	
	Date d=new Date();
	System.out.println(d);
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	String format = sdf.format(d);
	SimpleDateFormat sd1=new SimpleDateFormat("MM/dd/yyyy");
	String format2 = sd1.format(d);
	System.out.println(format);
	System.out.println(format2);
	
	SimpleDateFormat s=new SimpleDateFormat("yyyy/MM/d");
	
	Date parse = s.parse("2024/12/29");
	System.out.println(parse);
	
}
}
