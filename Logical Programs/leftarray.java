package newsir22;

import java.util.Arrays;

public class leftarray {
public static void main(String[] args) {
	int [] arr={1,2,5,8,6};
	int k=2;
	int km []=new int [k];
	for (int i = 0; i < km.length; i++) {
		km[i]=arr[i];
	}
	int x=0;
	int [] ans=new int [arr.length];
	for(int j=k;j<arr.length;j++)
	{
		ans[x]=arr[k];
		x++;
		k++;
	}
	for(int l=0;l<km.length;l++)
	{
		ans[x]=km[l];
		x++;
	}
	System.out.println(Arrays.toString(ans));
}
}
