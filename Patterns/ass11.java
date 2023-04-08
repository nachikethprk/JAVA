package patternsass1;

public class ass11 {
public static void main(String[] args) {
	for (int i = 1; i <=5; i++) {
		for (int j =5; j >=1; j--) {
			if(i>=j)
			{
				System.out.print(" "+i);
			}
			else
				System.out.print(" ");
		}
		System.out.println(" ");
	}
}
}
