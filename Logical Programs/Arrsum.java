package input;

import java.util.Scanner;

public class Arrsum
{
		public static void main(String[] args)
		{  
			Scanner S1= new Scanner(System.in);
			System.out.println("Enter the size of array");
			int size=S1.nextInt();
			int [] arr =new int [size];
			System.out.println("Enter the arrays");
			for(int i=0; i<arr.length; i++)
			{
				arr[i]=S1.nextInt();
				
			}
			
			
			for(int i=0; i<arr.length; i++)
			{
				int no=arr[i];
				int sum=0;
				
				
				
				while(no!=0)
				{
				
					int rem=no%10;
					sum=sum+rem;
					no=no/10;
				}
				if(no%2==0)
				{
				System.out.println(sum);
			}
			}
			
		}
		}

