package newsir;

import java.util.Scanner;

public class disorium 
{
	static int power(int base,int exp)
	{
		int ans=1;
		while(exp!=0)
		{
			ans=ans*base;
			exp--;
		}
		return ans;
	}
public static void main(String[] args)
{
	Scanner S1=new Scanner(System.in);
	System.out.println("enter the number");
	int no=S1.nextInt();
	
	int count =0;
	int copy=no;
	int temp=no;
	while(no!=0)
	{
		count++;
		 no=no/10;
	}
	//System.out.println(count);
	
	int sum=0;
	while(copy!=0)
	{
		int d=copy%10;
		sum=sum+power(d,count--);
		copy=copy/10;
	}
	if(sum==temp)
	{
		System.out.println(" its a disorium number");
	}
	else
	{
		//continue;
		System.out.println(" its not a disorium  number");
			}		
}
}
