package input;

import java.util.Scanner;

public class countstr 
{
	static int count(String str)
	{
		int count=0;
		for(int i=0; i<str.length(); i++)
		{
			count++;
		}
		return count;
	}
public static void main(String[] args) 
{
	Scanner S=new Scanner(System.in);
	System.out.println("Enter the String");
	String str=S.nextLine();
	
	int x=count(str);
	
	System.out.println(x);
	
	
}
}











