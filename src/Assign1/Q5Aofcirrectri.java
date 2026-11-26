package Assign1;

import java.util.Scanner;

public class Q5Aofcirrectri {
	public static void main(String[] args) {
		float r,ba,h,l,B,AC,AT,AR;
		float pi = 3.14f;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Radius of Circle: ");
		r = sc.nextFloat();
		
		
		System.out.println("Enter the Length of Rectangle: ");
		l = sc.nextFloat();
		System.out.println("Enter the Breadth of Rectangle: ");
		B = sc.nextFloat();
		
		
		System.out.println("Enter the Height of Triangle: ");
		h = sc.nextFloat();
		System.out.println("Enter the Base of Triangle: ");
		ba = sc.nextFloat();
		
		AC = pi* r* r;
		
		AR = l*B;
		
		AT =  (float) (0.5 * ba * h); 
		
		System.out.println("The Area of Circle: " + AC);
		System.out.println("The Area of Rectangle: "+ AR);
		System.out.println("The Area of Triangle: "+ AT);
		
		sc.close();
		
	}
}
