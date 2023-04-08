package newsir;

public class xylemandphloemnumbers
{
public static void main(String[] args)
{
	int no=154;
	int copy=no;
	int osum=0;
	int isum=0;
	
	while(no!=0)
	{
		if(no<9||no==copy)
		{
			osum=osum+no%10;
		}
		else
		{
			isum=isum+no%10;
		}
		no=no/10;
	}
	if(isum==osum)
	{
		System.out.println(no+" is a xylem number");
	}
	else
	{
		System.out.println(no+" is a phloem number");
	}
}
}
