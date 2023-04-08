package newsir22;

import java.util.Arrays;
import java.util.Scanner;

public class merge2arrays 
{
public static void main(String[] args)
{
Scanner s1=new Scanner(System.in);
System.out.println("enter the size1");
int size1=s1.nextInt();
int arr1[]=new int[size1];
System.out.println("enter the elements");
for (int i = 0; i < arr1.length; i++) 
{
	arr1[i]=s1.nextInt();
}

System.out.println("enter the size2");
int size2=s1.nextInt();
int arr2[]=new int[size2];
System.out.println("enter the elements");
for (int j = 0; j < arr2.length; j++) 
{
	arr2[j]=s1.nextInt();
}

int size=size1+size2;
int ans[]=new int[size];

for (int i = 0; i < arr1.length; i++) 
{
	ans[i]=arr1[i];
}
for (int j = 0; j < arr2.length; j++) 
{
	ans[arr1.length+j]=arr2[j];
}
System.out.println(Arrays.toString(ans));
}
}
