package patternsass1;

public class ass2 {
	public static void main(String[] args) {
		char arr[] ={'A','B','C','D','E'};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i>=j)
				System.out.print(arr[i]);
			}
			System.out.println(" ");		
		}
	}
}
