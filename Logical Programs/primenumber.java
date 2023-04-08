package input;

import java.util.Scanner;

public class primenumber 
{
	static String prime(int no)
	{
		boolean flag=true;
		
		for(int i=2; i<no; i++)
		{
			if(no%i==0)
			{
				flag=false;
				break;
			}
		}
			if(flag==true)
			{
				return("its a prime number");
			}
			else{
				return("its not a prime number");
				
			}
	}
public static void main(String[] args) 
{
	Scanner S1=new Scanner(System.in);
	System.out.println("Enter the number");
	int no= S1.nextInt();
	
	System.out.println( prime(no));
	}
}

