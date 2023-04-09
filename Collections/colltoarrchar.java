package collectionss;

	import java.util.ArrayList;

	public class colltoarrchar
	{
	public static void main(String[] args) 
	{
		ArrayList l1=new ArrayList();
		l1.add('A');
		l1.add('m');
		l1.add('L');
		l1.add('K');

		char [] arr=new char[l1.size()];
				
				for(int i=0; i<l1.size(); i++)
				{
					arr[i]=(char) l1.get(i);
				}
				
				for(int i=0;i<arr.length;i++)
				{
					System.out.println(arr[i]);
				}
	}
	}

