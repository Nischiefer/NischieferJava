package Assign1;

import java.util.Scanner;

public class Q12rolnam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name , nation;
		int roll;
		
		System.out.println("Enter Your Name: ");
		name = sc.nextLine();
		
		System.out.println("Enter Your Roll no: ");
		roll= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Your Nation: ");
		nation = sc.nextLine();
		
		System.out.println("\n===================================");
        System.out.println("          PERSON DETAILS           ");
        System.out.println("===================================");
        System.out.printf("%-15s: %d%n", "Roll Number",roll);
        System.out.printf("%-15s: %s%n", "Name", name);
        System.out.printf("%-15s: %s%n", "Nationality",nation);
        System.out.println("===================================");
		
		sc.close();
	}
}
