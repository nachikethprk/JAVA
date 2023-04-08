package newsir22;

public class removesubstrfromstr 
{
public static void main(String[] args)
{
	String str="hari is a bad boy";
	String ans="";
	for (int i = 0; i < str.length(); i++)
	{
		char ch=str.charAt(i);
		if(i>9&&i<14)
		{
			continue;
		}
		else
		{
			ans=ans+ch;
		}
	}
	System.out.println(ans);
}
}
