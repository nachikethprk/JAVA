package newsir;

import java.util.Scanner;

public class special2digit {
public static void main(String[] args) 
{
//	Scanner S1= new Scanner(System.in);
//	System.out.println("enter the number");
//	int no=S1.nextInt();
	int count=0;
	for(int no=1;no<100;no++)
	{
	int d1=no%10;
	int d2=no/10;
	int sum=d1+d2+(d1*d2);
	
	if(sum==no)
	{
		System.out.println(no +" its a special 2 digit number");
	count++;
	}
	else
	{
		//System.out.println(no+ " its not a special 2 digit number");
	}
	
	}
	System.out.println();
	System.out.println("there are "+count+" special digits");
}
}
