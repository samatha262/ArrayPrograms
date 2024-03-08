package com.learn.factorialarrays;

import java.util.Scanner;

public class FactorialofEle {

	public static void main(String[] args) {
		//Creating object of scanner class
		Scanner sc = new Scanner (System.in);
		//Displaying a msg to enter size of array
		System.out.println("enter the size of array: ");
		//Reading user  input
		int arr[]=new int[sc.nextInt()];
		//Displaying a msg to enter elements of array
		System.out.println("Enter the elements of array: ");
		//creating loop of range 0 to arr.length-1
		for(int i=0;i<=arr.length-1;i++)
		{
			//reading data from user and storing it
			arr[i]=sc.nextInt();
			//initializing a variable
			int fact=1;
			//creating a loop for calculating factorial of element
			for(int j=1;j<=arr[i];j++)
			{
				//condition to calculate factorial
				fact *=j;
			}
			//displaying the output
			System.out.println("The factorial of "+arr[i]+" is: "+fact);
		}
		//closing of scanner class
		sc.close();
	}

}
