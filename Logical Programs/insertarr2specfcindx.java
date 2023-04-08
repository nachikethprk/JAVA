package newsir22;

import java.util.Arrays;

public class insertarr2specfcindx 
{
public static void main(String[] args) {
	int [] arr={1,2,3};
	int [] brr={7,9};
	int index=1;
	int x=0;
	int y=0;
	
	int [] ans=new int[arr.length+brr.length];
	
	for(int i=0;i<ans.length;i++)
	{
		if(i>=index&&i<(index+brr.length))
		{
			ans[i]=brr[x];
			x++;
		}
		else
		{
			ans[i]=arr[y];
			y++;
		}
	}
	System.out.println(Arrays.toString(ans));
}
}
