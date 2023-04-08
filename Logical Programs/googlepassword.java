package newsir;

import java.util.Scanner;

public class googlepassword {
public static void main(String[] args) 
{
	Scanner s1=new Scanner(System.in);
	System.out.println("enter the string");
	String str=s1.next();
	
	int count=0;
	for(int i=0;i<str.length();i++)
	{
		count++;
	}
	
	int upp=0;
	for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				upp++;
			}
		}
	
	int low=0;
	for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='a'&&ch<='z')
			{
				low++;
			}
		}
	
	int num=0;
	for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='0'&&ch<='9')
			{
				num++;
			}
		}
	
	int spcl=0;
	for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if((ch>='0' && ch<='9')||(ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
			{
				continue;
			}
			else{
				spcl++;
			}
		}

	
	if((count>=8)&&(upp>=1)&&(low>=1)&&(num>=1)&&(spcl>=1)&&(str.charAt(str.length()-1)=='#'))
		{
				System.out.println("password correct");
		}
			
	else 
	{
		System.out.println("invalid password ");
	}
	
		
}
}
