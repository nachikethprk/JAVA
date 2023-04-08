package newsir;

import java.util.Scanner;

public class primefactors 
{
public static void main(String[] args) 
{
	Scanner S1=new Scanner(System.in);
	System.out.println("enter the number");
	int num=S1.nextInt();
	
//	for(int i=1;i<=num/2;i++)
//	{
//		if(i>1&&num%i==0&&prime(i))
//		{
//			System.out.println(i+" its a prime factor");
//		}
//	}
//}
//	private static boolean prime(int num)
//	{
//		for(int i=2;i<=num/2;i++)
//		{
//			if(num%i==0)
//			{
//				return false;
//			}
//			}
//		return true;
//	}	
//	
//	
	
	
//int num=66;
boolean flag=true;
for(int i=1;i<=num/2;i++)
{
	if(num%i==0)
	{
		for (int j = 2; j <i; j++)
		{
		if(i%j==0)
		{
			flag=false;
			break;
		}
		}
	
		if(flag==true&&i>1)
		{
			System.out.println(" the prime factors are "+i);
		}
		else{
			System.out.println("its not a prime number");
			break;
		}
	}
	else
		System.out.println("its not a prime factor");
	break;
}

}
}

