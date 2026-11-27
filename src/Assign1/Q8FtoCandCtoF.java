package Assign1;

import java.util.Scanner;

public class Q8FtoCandCtoF {

	public static void main(String[] args) {
		float C,F;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Temperature in Celcius: ");
		C = sc.nextFloat();
		
		F = (C * 9/5) + 32;
		
		System.out.println("The Temp in Farenheit is: "+ F);
		
		float CC,FF;
		
		System.out.println("Enter the Temperature in Farenheit: ");
		FF = sc.nextFloat();
		
		CC = (FF-32)*5/9;
		
		System.out.println("The Temp in Celcius is: " + CC);
		
		sc.close();
		
	}
}
