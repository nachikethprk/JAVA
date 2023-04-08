package patternsnwesir;

import java.util.Scanner;

public class sisa {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the size");
		int n=s1.nextInt();
		
		int star=n;
		int space=0;
		for (int i = 1; i <=n; i++) {
			
			for (int k = 1; k <=space; k++) {
				System.out.print("  ");
			}
			
			for (int l = 0; l <star; l++) {
				System.out.print(" "+(char)(l+65));
			}
			System.out.println();
			if(i<n/2+1)
			{
				space++;;
				star=star-2;
			}
			else
			{
				space--;
				star=star+2;
			}
		}
	}
}
