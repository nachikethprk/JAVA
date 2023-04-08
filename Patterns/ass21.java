package patternsass1;

import java.util.Scanner;

public class ass21 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the size");
		int n = s1.nextInt();
		
		//swastic
		// for (int i = 1; i <= n; i++) {
		// for (int j = 1; j <= n; j++) {
		// if(i==1&&j<=n/2+1||j==n/2+1||i==n&&j>=n/2+1||j==n&&i<=n/2+1||i==n/2+1||j==1&&i>=n/2+1)
		// {
		// System.out.print(" *");
		// }
		// else
		// System.out.print(" ");
		// }
		// System.out.println(" ");
		// }

		
		
		// for (int i = 1;i<=n; i++) {
		// for (int j = 1; j <=n; j++) {
		// if(i==1||j==1||i==n||j==n)
		// {
		// System.out.print(" *");
		// }
		// else if(i==j&&i>1&&i<n||i+j==n+1&&i>1&&j<n)
		// {
		// System.out.print(" #");
		// }
		// else
		// {
		// System.out.print(" ");
		// }
		// }
		// System.out.println(" ");
		// }

		
		//rhombus
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i+j==n/2+2||i-j==n/2||i+j==n+n/2+1||j-i==n/2)
				{
					System.out.print(" *");
				}
				else
					System.out.print("  ");
			}
			System.out.println("");
		}
	}
}
