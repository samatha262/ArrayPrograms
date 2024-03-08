package com.learn.search;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// Creating object of scanner class
     Scanner sc = new Scanner(System.in);
     //displaying a msg to enter  the size of the array
     System.out.println("Enter the length of the array");
     //Reading the input from the user
     int[] a =new int[sc.nextInt()];
     //displaying a msg to enter  the elements of the array
     System.out.println("Enter the elements of the array");
     for(int i=0;i<=a.length-1;i++)
     //Reading the input from the user
    	 a[i]=sc.nextInt();
     //Displaying a msg to enter the element which has to be searched
    System.out.println("Enter the element to be Searched");	
    //Reading the element from the user
     int key = sc.nextInt();
     //Invoking a method to search whether the element is present or not
     boolean result=checkElement(a,key);
     if(result)
     {
    	 System.out.println("Key "+key+" found "); 
     }
     else
     {
    	 System.out.println("Key "+key+" not found ");

     }
     sc.close();
	}
	static boolean checkElement(int[] a,int key)
	{
	     for(int i=0;i<=a.length-1;i++)
	     {
	    	 if(a[i]==key)
	    	 {
	    		 return true;
	    	 }
	     }
      return false;
	}

}
