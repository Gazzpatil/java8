package com;
@FunctionalInterface
interface Cab{
	public String bookingcab(String source,String destination);
}


public class CabBooking {
public static void main(String[] args) {
	Cab cab=(source,destination)->{System.out.println("The cab has been booked from "+ " "+ source+" to "+destination);
	return "price is Rs.5000";};
	String s=cab.bookingcab("bidar","hyderabad");
	System.out.println(s);
}
}
