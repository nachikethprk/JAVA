package patternsnwesir;

import java.util.Scanner;

public class diam12321 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the size");
		int n = s1.nextInt();
		int star = 1;
		int space = n / 2;

		for (int i = 1; i <= n; i++) {
			int x = 1;
			for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= star; k++) {
				System.out.print(" "+x);
				if (k < star / 2+1) {
					x++;
				} else {
					x--;
				}

			}
			System.out.println();
			if (i < n / 2 + 1) {
				star = star + 2;
				space--;
			} else {
				star = star - 2;
				space++;
			}
		}
	}
}
