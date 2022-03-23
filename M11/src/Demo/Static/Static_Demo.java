package Demo.Static;

public class Static_Demo {

	String name; //object bound
	int adhar; // object bound
	static String vaccine="Covid-Shield"; //class bound
	
	
	//public static void main(String[] args) {
	public Static_Demo(String name, int adhar) {
	
		this.name = name;
		this.adhar = adhar;

	}
	
	static void change()
	{
		vaccine="Co-vaccine";
	}
	void display()
	{
		System.out.println(name+" "+adhar+" "+vaccine);
	}
	
	public static void main(String[] args) {
		
		Static_Demo.change();
		
		Static_Demo p1=new Static_Demo("Gopi",12345);
		
		Static_Demo p2=new Static_Demo("Radha",123456);

	
				p1.display();
				p2.display();
	
	
	}
	
	
}
