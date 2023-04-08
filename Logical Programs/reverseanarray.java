package newsir22;


import java.util.Scanner;

import java.util.Arrays;

public class reverseanarray {
public static void main(String[] args) {
	
	Scanner s1=new Scanner(System.in);
	System.out.println("enter the size");
	int size=s1.nextInt();
	int [] arr=new int[size];
	System.out.println("enter the elements");
	for (int i = 0; i < arr.length; i++) 
	{
	arr[i]=s1.nextInt();	
	}
	
	int []ans=new int [arr.length];
	int x=0;
	for (int j = ans.length-1; j >=0 ; j++) {
		ans[x]=arr[j];
		x++;
	}
	System.out.println(Arrays.toString(ans));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	for(int i=0,j=ans.length-1;i<=arr.length-1&&j>=0;i++,j--)
//	{
//		ans[j]=arr[i];
//	}
//	System.out.println(Arrays.toString(ans));
	
	
}
}

