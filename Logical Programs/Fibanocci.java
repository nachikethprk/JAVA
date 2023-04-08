package input;

import java.util.Scanner;

public class Fibanocci 
{
	static void fibb(int a)
	{
		int fab1=0;
		int fab2=1;
		int fab3 = 0; 
		
		
		for(int i=1;i<=a;i++)
		{
			
			fab3=fab1+fab2;
			System.out.println(fab3);
			fab1=fab2;
			fab2=fab3;
		}
		
			
	}
public static void main(String[] args) {
	Scanner S1= new Scanner(System.in);
	System.out.println("Enter the number");
	int a=S1.nextInt();
	
  fibb(a);
}
}
