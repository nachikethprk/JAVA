package collectionss;

import java.util.ArrayList;

public class colltoarrstring {
	public static void main(String[] args) {
		
		ArrayList l1=new ArrayList();
		l1.add("hey");
		l1.add("bye");
		l1.add("broo");
		l1.add("gmm");

		String [] arr=new String[l1.size()];
				
				for(int i=0; i<l1.size(); i++)
				{
					arr[i]=(String) l1.get(i);
				}
				
				for(int i=0;i<arr.length;i++)
				{
					System.out.println(arr[i]);
				}
}
}
