package patternsass1;

public class ass8 {
	public static void main(String[] args) {
		//int arr[] ={5,4,3,2,1};
		//int arr[] ={1,2,3,4,5};
		
		for (int i = 1; i <=5; i++) {
			int x=1;
			for (int j =5; j >=1; j--) {
				if(i>=j)
				{
				System.out.print(x);
				x++;
				}
				else
					System.out.print(" ");
			}
			System.out.println(" ");		
		}
	}
}
