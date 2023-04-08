package newsir;

import java.util.Scanner;

public class power {
public static void main(String[] args) {
	Scanner S1=new Scanner(System.in);
	System.out.println("enter the base");
	int base=S1.nextInt();
	System.out.println("enter the exponent");
	int exp=S1.nextInt();
	
	int ans=1;
	while(exp!=0)
	{
		ans=ans*base;
		exp--;
	}
	System.out.println("the power of number is "+ans);
}
}
