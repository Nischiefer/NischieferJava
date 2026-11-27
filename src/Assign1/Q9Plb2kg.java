package Assign1;

import java.util.Scanner;

public class Q9Plb2kg {

	public static void main(String[] args) {
		float x,kg, lbs =0.454f;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How Many lbs Do you want to Convert into Kgs? : ");;
		x = sc.nextFloat();
		
		kg = x * lbs;
		
		System.out.println("The Total Kgs: " + kg);
		
		sc.close();
	}
	
}
