package newsir22;

import java.util.Arrays;
import java.util.Scanner;

public class deleteanaelement {
	public static void main(String[] args) 
	{
		int x=0;
		int arr[]={1,5,8,6,88};
		int element =6;
		int [] ans=new int[arr.length-1];
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]!=element)
			{
				ans[x]=arr[i];
				x++;
			}
		}
	System.out.println(Arrays.toString(ans));
		}
}
