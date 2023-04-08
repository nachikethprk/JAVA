package patternsnwesir;

import java.util.Scanner;

public class verti123 {
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("enter the size");
	int n=s1.nextInt();
	
	for (int i = 1; i <=n; i++) {
		int x=i;
		for (int j = 1; j <=n; j++) {
			if(i>=j)
			{
				System.out.print(" "+x);
				
			}
			x=x+n-j;
		}
		System.out.println();
	}
}
}
