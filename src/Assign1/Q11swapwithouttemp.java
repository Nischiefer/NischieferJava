package Assign1;

import java.util.Scanner;

public class Q11swapwithouttemp {
	
	public static void main(String[] args) {
		
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A: ");
		a = sc.nextInt();
		
		System.out.println("Enter B: "); 
		b = sc.nextInt();
		
		a= a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("The New A: "+ a);
		System.out.println("The New B: "+ b);
		
		sc.close();
	}
}
