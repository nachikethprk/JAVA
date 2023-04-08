package input;

import java.util.Scanner;

public class prime1to100 
{
public static void main(String[] args)
{
	Scanner S1=new Scanner(System.in);
	System.out.println("enter the starting range");
	int A=S1.nextInt();
	System.out.println("enter the ending range");
	int B=S1.nextInt();
	
	int count=0;
for (int j=A; j<=B; j++)
{
	int no=j;
	boolean flag = true;
	
	for (int i=2; i<no; i++)
	{
		
		if (no%i==0)
		{
			flag=false;
			break;
		}
	}
	if(flag==true)
	{
		System.out.println(no+ " is a prime number");
		count++;
	}
}
System.out.println("");
System.out.println( "There are "+count+" prime numbers from "+A+" to "+ B);
}
}
