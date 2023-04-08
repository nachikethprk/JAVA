package newsir22;

import java.util.Arrays;

public class arrayindescendingorder {
public static void main(String[] args) {
	int [] arr={5,2,9,54,32,64,1};
	Arrays.sort(arr);
	int x=0;
	int [] ans=new int[arr.length];
	for (int i = arr.length-1; i >=0; i--)
	{
		ans[x]=arr[i];
		x++;
	}
	System.out.println(Arrays.toString(ans));
}
}
