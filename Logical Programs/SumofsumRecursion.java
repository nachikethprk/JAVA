package input;

public class SumofsumRecursion 
{
	static int add(int no)
	{
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		while(sum>9)
		{
			sum=add(sum);
		}
		return sum;
	}
public static void main(String[] args) 
{
	
	int no=989876;
	System.out.println(add(no));
}
}
