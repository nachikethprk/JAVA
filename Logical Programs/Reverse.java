package input;

import java.util.Scanner;

public class Reverse {
public static void main(String[] args) {
	Scanner S1=new Scanner(System.in);
	System.out.println("Enter the number");
	int A=S1.nextInt();
	
	int rev=0;
	int rem;
	
	while(A!=0)
	{
	rem=A%10;
	rev=(rev*10)+rem;
	A=A/10;
	}
	System.out.println("the  Reversed number is " + rev);
}
}
