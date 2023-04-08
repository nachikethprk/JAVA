package patternsass1;

public class ass3 {
	public static void main(String[] args) {
		   
	char arr[] ={'A','B','C','D','E'};
		for (int i = 0; i < 5; i++) {
			int x=0;
			for (int j = 5;j>=0 ; j--) {
				if(i>=j)
				{
				System.out.print(arr[x]);
				x++;
			}
				else
					System.out.print(" ");	
			}
			System.out.println(" ");	
		}
	}
}
