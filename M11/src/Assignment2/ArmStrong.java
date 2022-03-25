package Assignment2;

public class ArmStrong {

	public static void main(String[] args) {
	
		int number  = 2000, originalNumber, remainder, result = 0, n = 0; 
		
		originalNumber = number;
		
		for(;originalNumber !=0; originalNumber /= 10, ++n);
		
		originalNumber = number;
		
		for(;originalNumber !=0; originalNumber /= 10);
		{
			remainder = originalNumber % 10;
			result += Math.pow(remainder, n);
		}
	
	if(result == number)
		System.out.println(number + " is a Armstrong number.");
	else 
		System.out.println(number + " is not a Armstrong number.");
	}

}
