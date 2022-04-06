package Demo.Bounded;

//import java.util.Arrays;
import java.util.*;

public class Bounded_Demo {

	public static void main(String[] args) {

		List<Integer> list1=Arrays.asList(1,2,3,4,5);
		System.out.println("Total sum is:" + sum(list1));
		
		List<Double> list2= Arrays.asList(2.5,6.8,7.9,5.4);
		System.out.println("Total sum is:" + sum(list2));
		
	}
	static double sum(List<? extends Number> list) //wild card operator
	{
		double sum=0.0;
		for(Number i: list)
		{
			sum += i.doubleValue();
		}
		return sum;
	}
}
