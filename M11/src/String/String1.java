package String;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = new String(" Faraz ");
System.out.println(s.length());
System.out.println(s.toLowerCase());
System.out.println(s.toUpperCase());
//System.out.println(upper);
String s1 = "Aurangabad";
System.out.println(s1.equals("Aurangabad"));
System.out.println(s1.equalsIgnoreCase("mumbai"));
System.out.println(s1.replace('M','t'));
System.out.println(s.trim());
String a = "Faraz Ahmed";
System.out.println(a.substring(2));
System.out.println(a.substring(2,6));
	}

}
