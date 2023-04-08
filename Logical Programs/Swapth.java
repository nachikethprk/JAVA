package input;

import java.util.Scanner;

public class Swapth
{
	static String swap(int A, int B)
	{
		int temp;
		temp=A;
		A=B;
		B=temp;
		return "the number A is  " + A+"  The number is " + B;
	}
public static void main(String[] args)
{
	Scanner S1=new Scanner(System.in);
	System.out.println("Enter the A value");
	int A=S1.nextInt();
	System.out.println("enter the B number");
	int B=S1.nextInt();
	
	System.out.println(swap(A,B));
}
}
