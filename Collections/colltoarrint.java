package collectionss;

import java.util.ArrayList;

public class colltoarrint
{
public static void main(String[] args) {
	
		ArrayList l1=new ArrayList();
		l1.add(158);
		l1.add(436);
		l1.add(5536);
		l1.add(245);

		int [] arr=new int[l1.size()];
				
				for(int i=0; i<l1.size(); i++)
				{
					arr[i]=(int) l1.get(i);
				}
				
				for(int i=0;i<arr.length;i++)
				{
					System.out.println(arr[i]);
				}
}
}
