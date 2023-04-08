

package newsir;

import java.util.Scanner;

public class passwordwithreason 
{
public static void main(String[] args)
{
	Scanner s1=new Scanner(System.in);
	System.out.println("enter the String");
	String str=s1.next();
	
	int Ucount=0;
	int Lcount=0;
	int Ncount=0;
	int Scount=0;
	
	if(str.length()>=8)
	{
		for (int i = 0; i < str.length(); i++) 
		{
		char ch=str.charAt(i);
		if(ch>='A'&&ch<='Z')
		{
			Ucount++;
		}
		
		else if(ch>='a'&&ch<='z')
		{
			Lcount++;
		}
		else if(ch>='0'&&ch<='9')
		{
			Ncount++;
		}
		
		else 
		{
			Scount++;
		}
	}
	
		if(Ucount>=1&&Lcount>=1&&Ncount>=1&&Scount>=1&&str.endsWith("#"))
		{
			System.out.println("valid password");
		}
else
{
	if (Ucount==0)
	{
		System.out.println("include atleast 1 Uppercase");
	}
	if (Lcount==0)
	{
		System.out.println("include atleast 1 lowercase");
	}
	if (Ncount==0)
	{	
		System.out.println("include atleast 1 number");
	}
	if (Scount==0)
	{
		System.out.println("include atleast 1 spcl character");
	}
	if (str.endsWith("#")== false)
		{
			System.out.println("password should end with #");
		}
}	
}
else
{
	System.out.println("enter more than 8 characters");
}
}
}
