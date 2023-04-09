package collectionss;

import java.util.ArrayList;

public class arrtocollbyte {
	public static void main(String[] args) 
	{
		byte [] arr ={10,125,20,63};
		
		ArrayList l1=new ArrayList();
		for(int i=0; i<arr.length; i++)
		{
			l1.add(arr[i]);
		}
		System.out.println(l1);
	}
}
