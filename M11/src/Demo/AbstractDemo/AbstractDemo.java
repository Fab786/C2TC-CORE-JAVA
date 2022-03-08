package Demo.AbstractDemo;

public class AbstractDemo {

	public static void main(String[] args) {
		

		
		ScootyDemo s = new ScootyDemo();
		s.NoOfWheels();
		
	}
}

abstract class Vehicle{
	
	public abstract void NoOfWheels();
	
	public abstract void m2();
		
	}

abstract class Scooty extends Vehicle {
	
	@Override
	
	public void NoOfWheels() {
		System.out.println(2);
		
	}

}
class ScootyDemo extends Scooty{
	
	@Override
	public void m2() {
		
		
		
			
		
	}
}