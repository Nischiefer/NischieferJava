package Assign1;
import java.util.Scanner;
public class Q14equalgretlow {
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number:");
		a = sc.nextInt();
		
		System.out.println("Enter Second Number:");
		b = sc.nextInt();
		
		if(a>b)
		{
			System.out.printf("A (%d) is Greater >>> than B (%d)%n",a,b);
		}
		else if(a<b)
		{
			System.out.printf("A (%d) is Smaller <<< than B (%d)%n",a,b);
		}
		else {
			System.out.printf("A (%d) is Equal === to B (%d)%n",a,b);
		}
		
		sc.close();
	}
}
