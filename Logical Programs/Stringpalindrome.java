package input;

import java.util.Scanner;

public class Stringpalindrome 
{
	public static void main(String[] args)
	{
Scanner s1=new Scanner(System.in);
System.out.println(" enter the string");
String str=s1.nextLine();
String rev="";
for (int i=str.length()-1;i>=0;i--)
{
	rev=rev+str.charAt(i);
}
System.out.println(rev);
if (str.equals(rev))
{
	System.out.println(" is a palindrome");
}
else 
{
	System.out.println(" is not a palindrome");
}
}
}
