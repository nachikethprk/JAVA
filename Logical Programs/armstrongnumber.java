package newsir;

import java.util.Scanner;

public class armstrongnumber 
{
	static int count(int copy)
	{
		int count=0;
		while(copy!=0)
		{
			copy=copy/10;
			count++;
		}
		return count;
	}
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
	System.out.println("enter the starting range");
	int A=S1.nextInt();
	System.out.println("enter the ending range");
	int B=S1.nextInt();
	
	
for (int i=A; i<=B; i++)
{
	int no=i;
	int count=0;
	int copy=no;
int sum=0;
while(no!=0)
{
	int base=no%10;
	sum=sum+power(base,count(copy));
	no=no/10;
}
if(sum==copy)
{
	System.out.println(i+" its a armstrong number");
}
else
{
	continue;
	//System.out.println(i+" its not a armstrong  number");
		}		
	}
}
}
