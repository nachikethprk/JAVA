package collectionss;

import java.util.ArrayList;

public class arrtocollfloat {
	public static void main(String[] args) 
	{
		float [] arr ={(float) 2.3,(float) 2.4,(float) 2.5,(float) 2.2};
		
		ArrayList l1=new ArrayList();
		for(int i=0; i<arr.length; i++)
		{
			l1.add(arr[i]);
		}
		System.out.println(l1);
	}
}
