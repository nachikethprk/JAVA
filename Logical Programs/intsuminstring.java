package input;

import java.util.Scanner;

public class intsuminstring 
{
public static void main(String[] args) 
{
	Scanner s1=new Scanner(System.in);
	System.out.println("enter the String");
	String str=s1.nextLine();
	
	int sum=0;
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch>='0'&&ch<='9')
		{
			int x=(int)ch;
			sum=sum+(x-48);
		}
	}
	System.out.println(sum);
}
}
