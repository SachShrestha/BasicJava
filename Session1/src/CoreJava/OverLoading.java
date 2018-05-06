package CoreJava;

public class OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		numbers (7);
		numbers (5.6);
		addition (7,8);
		addition (5,8,7);
		multiply (5,7,10,11); 
	}

	
	public static void numbers (int a) {
		
		System.out.println(a);
		
	}
	
	public static void numbers(double a) {
		
		System.out.println(a);
	}
	
	public static void addition (int a, int b) {
		
		int add = a+b;
		System.out.println(add);
	}
	
	public static void addition (int a, int b, int c) {
		
		int add = a+b+c;
		System.out.print(add);
	}
	
	public static void multiply (int a, int b, int c, int d) {
		int multiply = a-b-c-d;
		System.out.println(multiply);
		
	}
}
