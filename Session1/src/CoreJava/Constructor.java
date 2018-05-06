package CoreJava;

public class Constructor {

	int age;
	int salary;
	int house;
	String name;
	
	Constructor(){
		
		int age=47;
		int salary= 10000;
		int house =7;
		String name = "Jim Bob";
		
		System.out.println(age);
		System.out.println(salary);
		System.out.println(house);
		System.out.println(name);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


Constructor x=new Constructor();
System.out.println(x.age);
		
		
		
		
	}

}
