package Demo.Exception;

public class Try_Catch_Demo {

	public static void main(String[] args) {
		
	
		System.out.println("M1 is best"); //normal
		//no flow control statement
		try
		{
			System.out.println(2/0);//risky code
		}
		catch(ArithmeticException e)
		{
			System.out.println("Don't divide by zero...");
			
			System.out.println(2/2);
			
			System.out.println(e);
		}
		
		System.out.println("M1 is dirty");
	}

}
