package patternsnwesir;

import java.util.Scanner;

public class namediamond {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter your name");
		char arr[] = s1.next().toCharArray();
		int star = 1;
		int n = arr.length;
		int space = n / 2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= star; k++) {
				System.out.print(arr[k - 1] + " ");
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
