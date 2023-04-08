package newsir22;

import java.util.Arrays;
import java.util.Scanner;

public class insertelementintoarray 
{
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("enter the size");
	int size=s1.nextInt();
	int [] arr=new int[size];
	System.out.println("enter the elements");
for (int i = 0; i < arr.length; i++) 
{
	arr[i]=s1.nextInt();
}
System.out.println("enter the elements");
int element=s1.nextInt();

int ans []=new int[arr.length+1];
for (int i = 0; i < ans.length; i++) 
{
if(i<arr.length)
{
	ans[i]=arr[i];
}
else
{
	ans[i]=element;
}
}
System.out.println(Arrays.toString(ans));
}
}
