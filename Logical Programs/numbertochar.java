package newsir;

import java.util.Scanner;

public class numbertochar {
public static void main(String[] args) {

	Scanner S1= new Scanner(System.in);
	System.out.println("Enter the size of array");
	int size=S1.nextInt();
	int [] arr =new int [size];
	int no;
	for(int i=0; i<arr.length; i++)
	{
		arr[i]=S1.nextInt();
		no=(char) arr[i];
	
		System.out.println();
	}
}
}

