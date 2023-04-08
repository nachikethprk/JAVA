package newsir22;

import java.util.Arrays;
import java.util.Scanner;

public class inserttospecificindex
{
public static void main(String[] args) 
{
//	Scanner s1=new Scanner(System.in);
//	System.out.println("enter the size");
	int[] arr={1,4,2,3,4};
	int index=2;
	int element=8;
	int x=0;
	
	int [] ans=new int [arr.length+1];
	
	for (int i = 0; i < ans.length; i++) {
		if(i==index)
		{
			ans[i]=element;
		}
		else
		{
			ans[i]=arr[x];
			x++;
		}
	}
	System.out.println(Arrays.toString(ans));
}
}
