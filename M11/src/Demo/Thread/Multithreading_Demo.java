package Demo.Thread;

public class Multithreading_Demo {

	public static void main(String[] args) {

		MyThread obj=new MyThread();
				obj.start();
		for(int i=0;i<10;i++) {
			System.out.println("I am main Thread...");
		}
		

	}

}
//Thread
class MyThread extends Thread
{
	//Overide the run()
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("I am MyThread...");
		}
	}
}
