package Demo.ForEachLoop;



public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {10, 11, 12, 13};
		
		for(int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		
		
		System.out.println("\n\n***************\n");	
		
		for(int i : x) {
			System.out.println(i + " ");
		}

}
}