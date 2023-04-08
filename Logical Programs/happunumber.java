package newsir;

import java.util.Scanner;

public class happunumber 
{
	static int sum(int no)
	{
		int sum=0;
		while(no!=0)
			
		{
			int rem=no%10;
			sum=sum+(rem*rem);
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
			no=sum(no);
		}
		if(no==1||no==7)
			{
			System.out.println(copy+" happy number");
			}
			else
			{
				System.out.println(copy +" not a happy number");
		
			}
//		
	
	
	
	
	
	
//		public static void main(String[] args) 
//		{
//		Scanner S1=new Scanner(System.in);
//		System.out.println("enter the starting range");
//		int A=S1.nextInt();
//		System.out.println("enter the ending range");
//		int B=S1.nextInt();
//		
//		for (int i = A;i<=B;i++)
//		{
//			int num=i;
//			int copy=num;
//		int sum;
//		while(num>=10)
//		{
//			sum=0;
//			do
//			{
//				int d=num%10;
//				sum=sum+(d*d);
//				num=num/10;
//			}
//			while(num!=0);
//				num=sum;
//		}
//				if(num==1||num==7)
//				{
//				System.out.println(copy+" happy number");
//				}
//				else
//				{
//				System.out.println(copy+" not a happy number");
//				continue;
//				}
//		}
		
		
		
	
}
}
