package SwitchCase;

public class SwitchCase {

	
	public static void main(String[] args) {
		
		
		int x = 10;
		final int y = 20;
		byte b = 100;
		switch (b) {
		case 10:
			
			System.out.println(0);
			break;
		}
		
		System.out.println("************");
		switch (x) {
		
		}
		System.out.println("************");
		switch (x) {
		case 10:
		   System.out.println(10);
		   break;
		  
		case y:
		System.out.println(20);
		break;
		     
	}
		System.out.println("**************");
		switch(x+1) {
		case 10:
			System.out.println(10);
			break;
			
			
		case 11:
			System.out.println(11);
			break;
			
			
		case 100 + 200:
		System.out.println(300);
		break;
		}
		
	System.out.println("****************");
	switch(x) {
	
	default:
		
		System.out.println("default");
		break;
		
		
	case 97:
		System.out.println(10);
		break;
	

	case 98:
		System.out.println(11);
		break;
		
		
		
	}
	System.out.println("*************");
	int z = 3;
	switch(z) {
	
	default:
		System.out.println("default");
		
		
		
	case 0:
		System.out.println(0);
		break;
		
		
	case 1:
		System.out.println(1);
		
	case 2:
		System.out.println(2);
	
	}
	
	
		
}
}