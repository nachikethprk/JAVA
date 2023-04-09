package collectionss;

import java.util.ArrayList;

public class arrtocollstring {
	public static void main(String[] args) 
	{
		String [] arr ={"heyyy" , "balu" , "dolu", "bolu"};
		
		ArrayList l1=new ArrayList();
		for(int i=0; i<arr.length; i++)
		{
			l1.add(arr[i]);
		}
		System.out.println(l1);
	}
}
