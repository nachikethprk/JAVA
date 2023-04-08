package input;
import java.util.Scanner;
public class strongnumber 
{
public static void main(String[] args) 
{
	Scanner S1=new Scanner(System.in);
	System.out.println("enter the starting range");
	int A=S1.nextInt();
	System.out.println("enter the ending range");
	int B=S1.nextInt();
	
	for(int j=A; j<B;j++)
	{
		int no=j;
	int copy=no;
	int sum=0;
	
	while(no!=0)
	{
		int rem=no%10;
		int fact=1;
		for(int i=1; i<=rem;i++)
		{
			fact=fact*i;
		}
		sum=sum+fact;
		no=no/10;
	}
	if(copy==sum)
	{
		System.out.println(copy+" is a Strong number");
	}
	else
	{
		//System.out.println(copy +" is not a strong number");
	continue;
	}
	}
}
}
