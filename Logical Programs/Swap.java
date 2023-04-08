package input;

import java.util.Scanner;

public class Swap {
public static void main(String[] args) {
	Scanner S1=new Scanner(System.in);
	System.out.println("Enter the A value");
	int A=S1.nextInt();
	System.out.println("enter the B number");
	int B=S1.nextInt();
	
	A=A+B;
	B=A-B;
	A=A-B;
	
	System.out.println("The swapped numbers are "+ A+"and "+B);
}
}
