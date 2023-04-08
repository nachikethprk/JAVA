package input;

import java.util.Scanner;

public class countmtdprm 
{
	static int count(int no)
	{
		int count=0;
		for(int i=0; i<no.length(); i++)
		{
			count++;
		}
		return count;
	}
public static void main(String[] args) 
{
	Scanner S=new Scanner(System.in);
	System.out.println("Enter the number");
	int no=S.nextInt();
	
	int x=count(no);
	
	System.out.println(x);
	
	
}
}
