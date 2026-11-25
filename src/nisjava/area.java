package nisjava;

import java.util.Scanner;

public class area {

	public static void main(String[] args) {
		
	int l =40;
	int b=80;
	
	int area= l*b;
	
	System.out.println("The total area = " + area);
	
	
	//to get data from the user keyboard
	
	int ll, bb;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter value of l");
	ll =sc.nextInt();
	
	System.out.println("Enter value of b");
	bb =sc.nextInt();
	
	int areaa = ll*bb;
	System.out.println("Final outout area = "+ areaa);
	}
}
