package Assign1;

import java.util.Scanner;

public class Q4SimpleInterest {
	
	public static void main(String[] args) {
		float P,T,R,SI;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Principle:");
		P = sc.nextFloat();
		
		System.out.println("Enter Time in Years:");
		T = sc.nextFloat();
		
		System.out.println("Enter Rate:");
		R = sc.nextFloat();
		
		SI = (P*T*R)/100;
		
		System.out.println("The Simple Inetrest is: "+ SI);
		
		sc.close();
		
	}
	
}
