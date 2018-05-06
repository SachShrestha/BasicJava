package CoreJava;

public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		country();
		state();
		age();
		addition(0, 0);
	}
	
	public static void country() {
		
		System.out.println("I am from England");
	}
	
	public static void state() {
		
		System.out.println("I am from Manchester");
		
	}
	
	public static void age() {
		
		int x=9;
		System.out.println(x);
		
	}

	public static void addition(int a, int b) {
	int add =a+b;
	
	System.out.println(add);
}
}
