package nisjava;

import java.util.Scanner;

public class Q7swap {

	public static void main(String[] args) {
		float A,B,C;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter A = ");
		A = sc.nextFloat();
		
		
		System.out.println("Enter B = ");
		B = sc.nextFloat();
		
		C = A;
		A = B;
		B = C;
		
		System.out.println("New A = "+ A);
		System.out.println("New B = "+ B);
		
		sc.close();
		
		
	}
}
