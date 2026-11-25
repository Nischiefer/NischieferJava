package nisjava;

import java.util.Scanner;

public class Q6CCtoF {

	public static void main(String[] args) {
		float C,F;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Temperature in Celcius: ");
		C = sc.nextFloat();
		
		F = (C * 9/5) + 32;
		
		System.out.println("The Temp in Farenheit is: "+ F);
		
		sc.close();
		
		
	}
}
