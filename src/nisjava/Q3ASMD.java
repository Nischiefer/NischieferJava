package nisjava;

import java.util.Scanner;

public class Q3ASMD {

	public static void main(String[] args) {
		int x,y,A,S,M,D;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your First Number = ");
		x= sc.nextInt();
		
		System.out.println("Enter Your Second Number = ");
		y= sc.nextInt();
		
		A= x+ y;
		S= x- y;
		M= x*y;
		D= x/y;
		
		
		System.out.println("Add = "+ A);
		System.out.println("Sub = "+ S);
		System.out.println("Mul = "+ M);
		System.out.println("Div = "+ D);
		
		sc.close();
		
	}
}
