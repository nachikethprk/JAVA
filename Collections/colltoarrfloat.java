package collectionss;

import java.util.ArrayList;

public class colltoarrfloat {
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add((float)1.25);
		l1.add((float)4.36);
		l1.add((float)55.36);
		l1.add((float)2.45);

		float [] arr=new float[l1.size()];
				
				for(int i=0; i<l1.size(); i++)
				{
					arr[i]=(float) l1.get(i);
				}
				
				for(int i=0;i<arr.length;i++)
				{
					System.out.println(arr[i]);
				}
	}
	}

