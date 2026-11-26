package Assign1;

import java.util.Scanner;

public class Q6pofcirrectri {

	public static void main(String[] args) {
		float r,a,b,c,L,B,PC,PT,PR;
		float pi = 3.14f;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Radius of Circle: ");
		r = sc.nextFloat();
		
		
		System.out.println("Enter the Length of Rectangle: ");
		L = sc.nextFloat();
		System.out.println("Enter the Breadth of Rectangle: ");
		B = sc.nextFloat();
		
		
		System.out.println("Enter the 3 sides of Triangle: ");
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		
		PC =2* pi* r;
		
		PR =2*(L+B);
		
		PT =  a+b+c; 
		
		System.out.println("The Perimeter/Circumference of Circle: " + PC);
		System.out.println("The perimeter of Rectangle: "+ PR);
		System.out.println("The perimeter of Triangle: "+ PT);
		
		sc.close();
}
}
	
