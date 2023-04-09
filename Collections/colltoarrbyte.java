package collectionss;

import java.util.ArrayList;

public class colltoarrbyte {
	public static void main(String[] args) {
		
		ArrayList l1=new ArrayList();
		l1.add((byte)15);
		l1.add((byte)43);
		l1.add((byte)55);
		l1.add((byte)2);

		byte [] arr=new byte[l1.size()];
				
				for(int i=0; i<l1.size(); i++)
				{
					arr[i]=(byte) l1.get(i);
				}
				
				for(int i=0;i<arr.length;i++)
				{
					System.out.println(arr[i]);
				}
}
}
