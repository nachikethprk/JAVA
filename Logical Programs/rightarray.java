package newsir22;

import java.util.Arrays;

public class rightarray 
{
public static void main(String[] args) 
{
	int [] arr={5,9,2,3,1};
	int k=2;
	int [] ans=new int [arr.length];
	int x=0;
	for (int i = arr.length-k; i < arr.length; i++) {
		ans[x]=arr[i];
		x++;
	}
	for(int j=0;j<arr.length-k;j++)
	{
		ans[x]=arr[j];
		x++;
	}
	System.out.println(Arrays.toString(ans));
}
}
