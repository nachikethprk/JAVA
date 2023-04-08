package patternsnwesir;

import java.util.Scanner;

public class buttefly {
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("enter the size");
	int n=s1.nextInt();
	int star=1;
	int space=n-2;
	for (int i = 1; i <=n; i++) {
		for (int j = 1; j <=star; j++) {
			System.out.print(" *");
		}
		
		for (int k = 1; k <=space; k++) {
			System.out.print("  ");
		}
		
		for (int l = 1; l <=star; l++) {
			if(l<n/2+1)
			System.out.print(" *");
		}
		System.out.println();
		if(i<n/2+1)
		{
			space=space-2;
			star++;
		}
		else
		{
			space=space+2;
			star--;
					
		}
	}
}
}
