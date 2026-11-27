package Assign1;

import java.util.Scanner;

public class Q7cylindervolume {

	public static void main(String[] args) {
		float r, h, v;
		float pi = 3.1415f;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Radius of Circle: ");
		r= sc.nextFloat();
		
		System.out.println("Enter the Height of Circle: ");
		h= sc.nextFloat();
		
		v = pi * r * r * h;
		
		System.out.println("The Volume of Cylinder: "+ v);
		
		sc.close();
		
	}
}
