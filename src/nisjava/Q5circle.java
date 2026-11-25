package nisjava;

import java.util.Scanner;

public class Q5circle {
	public static void main(String[] args) {
		
	float r,area,cir;
	float pi=3.14f;		//float cha bhane pachadi f rakhne value ko
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the radius of Circle: ");
	r = sc.nextFloat();
	
	area = pi* r* r;
	
	cir = 2 * pi * r;
	
	System.out.println("Area = "+ area);
	System.out.println("Circumference = "+ cir);

	sc.close();
	
	
	}
}
