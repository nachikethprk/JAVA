package patternsass1;

public class ass15 {
public static void main(String[] args)
{
	int x=1;
	for (int i = 0; i < 5; i++) {
		
		for (int j = 0; j < 5; j++) {
			if(i>=j)
			{
				System.out.print(" "+x);
				x++;
			}
		}
		System.out.println(" ");
	}
}
}
