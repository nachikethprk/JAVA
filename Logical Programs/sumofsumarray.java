package input;

import java.util.Scanner;

public class sumofsumarray
{
	static int add(int no)
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
public static void main(String[] args)
{
	Scanner S1=new Scanner(System.in);
	System.out.println("enter the size");
	int size=S1.nextInt();
	int[]arr=new int [size];
	
	System.out.println("enter the array elements");
	for(int i=0; i<arr.length; i++)
	{
		arr[i]= S1.nextInt();
	}
	
	for(int i=0; i<arr.length; i++)
	{
		int no=arr[i];
		
		while(no>9)
		{
			no=add(no);
		}
		System.out.println(no);
	}
}
}
