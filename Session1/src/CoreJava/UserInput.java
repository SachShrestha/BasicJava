package CoreJava;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader=new Scanner(System.in);
		
		System.out.println("What is your name");
		String name=reader.next();
		System.out.println("Your name is "+name);
		
		Scanner reader1=new Scanner(System.in);
		
		System.out.println("How old are you");
		int age=reader1.nextInt();
		System.out.println("Your age is "+ age);
		
		
		
	}

}
