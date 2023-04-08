package newsir22;

import java.util.HashSet;
import java.util.Scanner;

public class panagram 
{
public static void main(String[] args) 
{
Scanner s1=new Scanner(System.in);
System.out.println("enter the String");
String str=s1.nextLine();

str=str.toLowerCase();
HashSet h1=new HashSet();
for(int i=0;i<str.length();i++)
{
	char ch=str.charAt(i);
	if(ch>='a'&&ch<='z')
	{
		h1.add(ch);
	}
}
if(h1.size()==26)
{
	System.out.println("its an Panagram");
}
else
{
	System.out.println("its not an Panagram");
}
}
}
