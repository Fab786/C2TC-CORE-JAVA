package Demo;
//package myPack;

public class Main{
	
	public void m()
	{
		System.out.println("No arguments");
	}
	
	public void m(int i)
	{
		System.out.println("Int arguments");
	}
	
	public void m(double d)
	{
		System.out.println("Double arguments");
	}
	
	public static void main(String[] args){

		Main obj=new Main();
		obj.m();
		obj.m(2);
		obj.m(4.67);
		
		obj.m('a');
		obj.m(2);
		obj.m(10l);
		obj.m(5.6f);
	}	
}

