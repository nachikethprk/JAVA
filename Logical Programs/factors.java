package newsir;

import java.util.Scanner;

public class factors {
public static void main(String[] args) 
{
	Scanner S1=new Scanner(System.in);
	System.out.println("enter the number");
	int no=S1.nextInt();
	for(int i=1; i<=no;i++ )
	{
		if(no%i==0)
		{
			System.out.println(i);
			
		}
	}
}
}
