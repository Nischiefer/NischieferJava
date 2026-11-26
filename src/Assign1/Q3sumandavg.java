package Assign1;

import java.util.Scanner;

public class Q3sumandavg {

	public static void main(String[] args) {
		float a,b,S,Av;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Numeber:");
		a = sc.nextFloat();
		
		System.out.println("Enter the Second Numeber:");
		b= sc.nextFloat();
		
		S= a+b;
		
		Av = (a+b)/2;
		
		
		System.out.println("The Sum: "+ S);
		System.out.println("The Average: "+ Av);
		
		sc.close();
	}
	
}
