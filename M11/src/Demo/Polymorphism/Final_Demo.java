package Demo.Polymorphism;

public class Final_Demo {

	public static void main(String[] args) {

		

	}

}

class Parent
{
	void property()
	{
		System.out.println("House...Plot...Money...Car");
	}
void marry()
{
	System.out.println("Lata");
}

}

class Child extends Parent
{
	void marry() // ....method Overriding--- Giving new implementation
	{
		System.out.println("Kriti Sanon");
	}
}

