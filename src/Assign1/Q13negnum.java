package Assign1;
import java.util.Scanner;

public class Q13negnum {
	
	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		x =sc.nextInt();
		
		if(x<0)
		{
			System.out.printf("You Entered %d !!! Negative kina thicheko mula???",x);
		}
		
		sc.close();
	}
}
