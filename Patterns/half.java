package patternsnwesir;

import java.util.Scanner;

public class half {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		System.out.println("enter the name");
		
		char arr[]=s1.next().toCharArray();
		int n=arr.length*2-1;
		int x=1;
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= x; j++) {
				System.out.print(arr[j-1]+" ");
			}
			System.out.println();
			if (i < n / 2 + 1) 
				x++;
			 else 
				x--;
		}
	}
}
