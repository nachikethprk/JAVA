package patternsass1;

public class ass22 {
public static void main(String[] args) {
	for (int i = 1; i <=9; i++) {
		for (int j =9; j >=1; j--) {
			if(i>=j&&i%2!=0)
			{
				if(j%2==0)
				System.out.print(" 0");
				else
					System.out.print(" 1");
			}
			else
				System.out.print(" ");
		}
		System.out.println(" ");
	}
}
}
