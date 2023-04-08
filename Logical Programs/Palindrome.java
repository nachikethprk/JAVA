package input;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	Scanner S1=new Scanner(System.in);
	System.out.println("Enter the number");
	int A=S1.nextInt();
	
	int temp=A;
	int rev=0;
	int rem;
	
	while(A!=0)
	{
	rem=A%10;
	rev=(rev*10)+rem;
	A=A/10;
	}
	
	if(rev==temp)
	{
	System.out.println("Its a palindrome");
	}
	else
	{
		System.out.println("Its not a plaindrome ");
	}
}
}
