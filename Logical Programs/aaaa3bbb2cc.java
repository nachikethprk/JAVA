package newsir;
import java.util.Scanner;
public class aaaa3bbb2cc
{
public static void main(String[] args)
{
	Scanner s1=new Scanner(System.in);
	System.out.println("enter the string");
	String str=s1.nextLine();
	
	int no;
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch>='0'&&ch<='9')
		{
			int x=(int)ch;
			no=x-48;
			//System.out.print(no);
		
		//while(no>0)
			for(int j=1;j<=no;j++)
		{
					System.out.print(str.charAt(i+1));
					//no--;
		}
		}
	}
}
}
