package input;

import java.util.Scanner;

public class countinp 
{
	static int count(int no)
	{
		int count=0;
		
		while(no!=0)
		{
			count++;
			no=no/10;
		}
		return count;
	}
public static void main(String[] args) 
{
	Scanner S1=new Scanner(System.in);
	System.out.println("enter the number");
	int no= S1.nextInt();
	
	int x=count(no);
	
	System.out.println(x);
}
}
