package newsir22;

public class removevowelsandspclchar {
	public static void main(String[] args) {
		String str = "An apple @a day keeps the D@octor away*";
		
		str.toLowerCase();
		
		for (int i = 0; i < str.length(); i++) 
		{
			char ch = str.charAt(i);
			//remove vowels
//			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
//			{
//				continue;
//			}
//			else
//			{
//				System.out.print(ch);
//			}
			//remove specisl characters
			if (ch >= 'a' && ch <= 'z'||ch==' '||ch >= 'A' && ch <= 'Z'||ch >= '0' && ch <= '9') 
			{
				System.out.print(ch);
			}
			
			
		}
	}
}
