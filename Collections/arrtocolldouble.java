package collectionss;

import java.util.ArrayList;

public class arrtocolldouble {
	public static void main(String[] args) 
	{
		double [] arr ={10.55,125.25,20665.46,63.41564654};
		
		ArrayList l1=new ArrayList();
		for(int i=0; i<arr.length; i++)
		{
			l1.add(arr[i]);
		}
		System.out.println(l1);
	}
}
