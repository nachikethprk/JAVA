package newsir;

import java.util.Scanner;

public class nametolower
{
public static void main(String[] args) 
{
	Scanner s1=new Scanner(System.in);
	System.out.println("enter the string");
	String str=s1.nextLine();
	
	String ans="";
	
	int count=0;
	for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			//int no=(int)ch;
			if((ch>='0' && ch<='9')||(ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
			{
				continue;
			}
			else{
				count++;
			}
		}
	System.out.println(count);
	
	
//	int count=0;
//	for(int i=0;i<str.length();i++)
//		{
//			char ch=str.charAt(i);
//			if(ch>='0'&&ch<='9')
//			{
//				count++;
//			}
//		}
//	System.out.println(count);
	
	
	
	
		
//	for(int i=0;i<str.length();i++)
//	{
//		char ch=str.charAt(i);
//		if(ch>'a'&&ch<'z')
//		{
//			int x=(int)ch;
//			ans=ans+(char)(x-32);
//		}
//		else
//		{
//			ans=ans+ch+"";
//		}
//	}
//	System.out.println(ans);
}
}
