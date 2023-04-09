package collectionss;

import java.util.ArrayList;

public class colltoarrshort {
	public static void main(String[] args) {
		
		ArrayList l1=new ArrayList();
		l1.add((short)158);
		l1.add((short)436);
		l1.add((short)5536);
		l1.add((short)245);

		short [] arr=new short[l1.size()];
				
				for(int i=0; i<l1.size(); i++)
				{
					arr[i]=(short) l1.get(i);
				}
				
				for(int i=0;i<arr.length;i++)
				{
					System.out.println(arr[i]);
				}
}
}
