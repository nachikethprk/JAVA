package newsir;

import java.util.Scanner;
public class demo {

   public static void main (String [] args)
   {
       Scanner S1= new Scanner(System.in);
    System.out.println("Enter the size of array");
    int size=S1.nextInt();
    int [] arr =new int [size];
    for(int i=0; i<arr.length; i++)
    {
        arr[i]=S1.nextInt();
    }
        
        	 int sum=0;
    for(int i=0;i<arr.length-1;i++)
    {
        sum=sum+arr[i];
    }
    System.out.print(sum +" ");
   
    
        
        	int add=0;
    for(int j=arr.length-1;j>0;j--)
    {
         add=add+arr[j];
    }
    System.out.print(add);
        
    }
   }

    

