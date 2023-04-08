package newsir;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class removeduplicates 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the String..");
		String str=s1.nextLine();
		
		String [] str1=str.split(" ");
		LinkedHashSet l1 = new LinkedHashSet();
		for (int i = 0; i < str1.length; i++) 
		{
			l1.add(str1[i]);
		}
		System.out.println(l1);

		String ans = "";
		for (Object o1 : l1) {
			
			System.out.print(o1+" ");
		}
	}
}
