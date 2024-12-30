package java8;

public class Car implements Vehicle{
	
	
	public static void main(String[] args) {
		Car c=new Car();
		c.start();
		Vehicle.repair();
	}

	@Override
	public void start() {
		System.out.println(" Car has Started !!!!!!!!!!!!");
		
	}
	
		
	
	
}
