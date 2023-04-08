package newsir22;

public class addsubstrtostr {
public static void main(String[] args) {
	String str="rama is a boy";
	String sub="good";
	String ans=" ";
	int x=0;
	int index=10;
	for (int i = 0; i < str.length()+1; i++) {
		if(index==i)
		{
			ans=ans+sub+" ";
		}
		else
		{
			ans=ans+str.charAt(x);
			x++;
		}
	}
	System.out.println(ans);
}
}
