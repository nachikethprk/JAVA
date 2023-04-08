package newsir22;

import java.util.Scanner;

public class duplicateelementsinarr 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the array size");
		int size = s1.nextInt();
		int[] arr = new int[size];
		System.out.println("enter the elements");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = s1.nextInt();
		}
	
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i + 1; j < arr.length; j++) 
			{
				if (arr[i] == arr[j]) 
					System.out.println(arr[i]);
			}
		}

	}
}
