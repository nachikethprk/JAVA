package patternsass1;

public class ass9 {
public static void main(String[] args) {
		
		
		for (int i = 1; i <=5; i++) {
			for (int j = 5; j >=1; j--) {
				if(i>=j)
				{
					if(i%2==0)
					System.out.print(0);
					else 
						System.out.print(1);
				}
				else
					System.out.print(" ");
			}
			System.out.println(" ");		
		}
	}
}
