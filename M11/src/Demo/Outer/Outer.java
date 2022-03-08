package Demo.Outer;

public class Outer {

	int x = 10;
	static int y = 100;
	
	
	static class inner{
		
		public void method_demo() {
			
			
			System.out.println("I am Inner class");
			System.out.println(y);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		Outer.inner obj2 = new Outer.inner();
		obj2.method_demo();
		
		inner obj3 = new inner();
		obj3.method_demo();
		
		
		

	}

}
