package Assign1;

import java.util.Scanner;

public class Q15Ascii {
	
	public static void main(String[] args) {
		int ascii;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an ASCII code (0 - 128) : ");
		ascii = sc.nextInt();
		
		if(ascii>=0 && ascii<=128) {
			char character = (char) ascii;
			System.out.printf("The Character for %d ASCII code is : %c %n",ascii,character);	
		}else {
			System.out.println("K jpt thicheko !!??");
		}
		
		sc.close();
		
	}
}
