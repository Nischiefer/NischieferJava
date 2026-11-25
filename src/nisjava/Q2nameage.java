package nisjava;

import java.util.Scanner;

public class Q2nameage {
	
	public static void main(String[] args) {
		
	int age;
	String name;
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Name: ");
	name = sc.nextLine();
	
	System.out.println("Enter Your Age: ");
	age = sc.nextInt();
	
	
	System.out.println("Your Name = "+ name);
	System.out.println("Your Age = "+ age);
	
	sc.close();
	}
}
