package newsir;

import java.util.Scanner;

public class uppertolower {
public static void main(String[] args) 
{
	
Scanner s1=new Scanner(System.in);
System.out.println("enter the string");
String str=s1.next();
	String str1="";
	String ans="";
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		int x=(int) ch;
		char ch1=(char)(x-32);
		System.out.print(ch1);
//ans=ans+(char)(x+32);
	}
}
}
