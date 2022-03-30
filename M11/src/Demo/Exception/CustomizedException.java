package Demo.Exception;

import java.util.Scanner;

public class CustomizedException {

	public static void main(String[] args) {

		int age;
		System.out.println("Enter your age...");
		Scanner s=new Scanner(System.in);
		age=s.nextInt();
		
		if(age<18)
		{
			throw new CantVote("You cannot cast your vote as age is less than 18...");
		}
		else
		{
			System.out.println("You can vote...");
		}

	}

}
class CantVote extends RuntimeException
{
	CantVote(String msg)
	{
		super(msg);
	}
}
