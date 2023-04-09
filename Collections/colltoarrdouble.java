package collectionss;

import java.util.ArrayList;

public class colltoarrdouble {
public static void main(String[] args) {
	ArrayList l1=new ArrayList();
	l1.add(1.25);
	l1.add(4.36);
	l1.add(55.36);
	l1.add(2.45);

	double [] arr=new double[l1.size()];
			
			for(int i=0; i<l1.size(); i++)
			{
				arr[i]=(double) l1.get(i);
			}
			
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
}
}
