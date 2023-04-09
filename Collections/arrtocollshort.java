package collectionss;

import java.util.ArrayList;

public class arrtocollshort {
	public static void main(String[] args) 
	{
		short [] arr ={1000,125,200,630};
		
		ArrayList l1=new ArrayList();
		for(int i=0; i<arr.length; i++)
		{
			l1.add(arr[i]);
		}
		System.out.println(l1);
	}
}
