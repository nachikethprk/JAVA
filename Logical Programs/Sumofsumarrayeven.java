package input;

import java.util.Scanner;

public class Sumofsumarrayeven 
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
	int [] arr={121,123,124,125,126}; 
	for(int i=0; i<arr.length; i++)
	{
		if(i%2==0)
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
}


