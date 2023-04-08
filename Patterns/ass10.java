package patternsass1;

public class ass10 {
	public static void main(String[] args) {
		
		String str="LOKESH";
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if(i>=j)
				System.out.print(str.charAt(j));
			}
			System.out.println(" ");		
		}
	}
}
