package Demo;

public class Abstract_class extends Base {


	Abstract_class(String str2){
	
	super(str2);
		System.out.println("Derived class constructor");
	
	}	
	public static void main(String[] args) {

		Abstract_class obj1=new Abstract_class("Values passed through the class constructor");
		
		}
		
	}

abstract class Base{
	
	Base(String str){
		System.out.println("Abstract class constructor is created"+"and initialized values are"+str);
	}

}