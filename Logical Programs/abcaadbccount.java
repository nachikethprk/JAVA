package newsir;

import java.util.Scanner;

public class abcaadbccount 
{
public static void main(String[] args) 
{
	int count=0;
	Scanner s1=new Scanner(System.in);
	System.out.println("enter the string");
	String str=s1.nextLine();
	str=str.toLowerCase();
	
	for(int i=0;i<str.length();i++)
	{
		int y=97;
		for(int j=0;j<str.length();j++)
		{
		char ch=str.charAt(j);
			int x=(int)ch;
			
			while(y<123)
			{
				if(x==y)
				{
				count++;
				}
				y++;
			}
		
		}
		
	}
	System.out.println(count);
}
}
