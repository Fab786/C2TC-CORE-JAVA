package Demo.EvenOdd;

import java.util.*;


public class EvenOdd {

	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter No:");
		int n = sc.nextInt();
		if(n%2==0) {
			
			System.out.println(n + " is Even");
			
		}
		
		else
			
		{
			System.out.println(n + " is Odd");
		}

		
		
	}

}
