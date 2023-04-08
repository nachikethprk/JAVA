package newsir22;

public class vowelsandconsonentscount {
	public static void main(String[] args) {
		String str = "iijjooll*&*^&*";
		
		str.toLowerCase();
		int count = 0;
		int run = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			//if (ch >= 'a' && ch <= 'z') {
				 //vowels count...
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					run++;
				}
				// Consonents count..
				 if(ch>='a'&&ch<='z'&&ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u')
				 {
					count++;
				}
			}
		
		System.out.println("vowels count..==>"+run);
		System.out.println("Consonents count..==>" + count);
	}
}
