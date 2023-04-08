package input;

import java.util.Scanner;

public class Factorial 
{
	static int factor(int a)
	{
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
			System.out.println("Enter the value");
	int a=sc.nextInt();
	
	int x=factor(a);
	System.out.println("The factorial is " + x);
}
}
