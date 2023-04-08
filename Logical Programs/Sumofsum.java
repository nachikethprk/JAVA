package input;

import java.util.Scanner;

public class Sumofsum 
{
	static int sum(int no)
	{
		int sum=0;
		while(no!=0)
			
		{
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		return sum;
	}
public static void main(String[] args) {
	Scanner S1= new Scanner(System.in);
	System.out.println("enter the number");
	int no=S1.nextInt();
	
	while(no>9)
	{
		no=sum(no);
	}
	System.out.println(no);
}
}
