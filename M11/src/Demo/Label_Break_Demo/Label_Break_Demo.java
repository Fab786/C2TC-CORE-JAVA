package Demo.Label_Break_Demo;

public class Label_Break_Demo {

	public static void main(String[] args) {

		int x=10;
		l:
		{
			System.out.println("Login");
			
			if(x==100)
				break l;
			System.out.println("End");
			
		}
		System.out.println("Hello");

	}

}
