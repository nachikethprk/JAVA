package collectionss;

import java.util.ArrayList;

public class collectoarrobj
{
public static void main(String[] args) 
{
	ArrayList l1=new ArrayList();
	l1.add(10);
	l1.add(20.22);
	l1.add('A');
	l1.add("hii");

	Object [] arr=new Object[l1.size()];
			
			for(int i=0; i<l1.size(); i++)
			{
				arr[i]=l1.get(i);
			}
			
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
}
}
