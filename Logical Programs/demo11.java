package newsir22;
import java.util.Scanner;

public class demo11 
{
	static int happy(int no)
	{
	int sum=0;
	while(no!=0)
	{
		int d=no%10;
		sum=sum+(d*d);
		no=no/10;
	}
	return sum;
	}
	
public static void main(String[] args)
{	
	Scanner S1= new Scanner(System.in);
	System.out.println("enter the number");
	int no=S1.nextInt();
	int copy=no;
	while(no>9)
	{
	no=happy(no);
	}
	
	if(no==1||no==7)
	{
	System.out.println(copy+" happy number");
	}
	else
	{
		System.out.println(copy +" not a happy number");

	}

}
}
