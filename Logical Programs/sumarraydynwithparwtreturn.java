package input;

import java.util.Scanner;

public class sumarraydynwithparwtreturn
{
static int array (int[] arr)
{
	int sum=0;
	for(int i=0; i<arr.length;i++)
	{
		
		sum=sum+arr[i];
	}
	
	return sum;
}
public static void main(String[] args) 
{
	Scanner S1= new Scanner(System.in);
	System.out.println("enter the array size");
			int size=S1.nextInt();
			int [] arr =new int [size];
			
			System.out.println("enter the elements");
			{
				for(int i=0; i < arr.length; i++)
				{
					arr[i]=S1.nextInt();
				}
				int x=array(arr);
				System.out.println(x);
			}
			
			
}
}
