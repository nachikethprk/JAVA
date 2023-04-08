package input;

import java.util.Scanner;

public class Array {
public static void main(String[] args) {
	Scanner S1= new Scanner(System.in);
	System.out.println("Enter the size of array");
	int size=S1.nextInt();
	int [] arr =new int [size];
	for(int i=0; i<arr.length; i++)
	{
		arr[i]=S1.nextInt();
	}
	
	int sum=0;
	for(int i=0; i<arr.length; i++)
	{
		System.out.println(arr[i]);
	}
	
}
}
