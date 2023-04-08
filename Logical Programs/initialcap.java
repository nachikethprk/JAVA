package newsir;

import java.util.Scanner;

public class initialcap 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the string");
		String str = s1.nextLine();

		str = str.toLowerCase();
		String[] arr = str.split(" ");
		String word = "";
		String ans = "";

		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length(); j++) 
			{
				char ch = arr[i].charAt(j);
				if (j == 0) 
				{
					int x = (int) ch;
					word = word + (char) (x - 32);
				}
				else
				{
					word=word+ch;
				}
			}
			if(i<arr.length-1)
				ans=ans+word+" ";
			else
				ans=ans+word;
		}
		Thread.sleep(2000);
		System.out.print(ans);
		
	}
}
