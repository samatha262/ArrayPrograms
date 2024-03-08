package com.learn.reversearray;

import java.util.Scanner;

public class ReverseOrder2 {

	public static void main(String[] args) {
		//Creating object of scanner class
		Scanner sc = new Scanner(System.in);
		//displaying a msg to enter the size of the array
		System.out.println("Enter the size of the array 1 : ");
		//Reading data from the user 
		int [] arr1 = new int [sc.nextInt()];
		//displaying a msg to enter the size of the array
		System.out.println("Enter the elements of the array 1 : ");
		//Creating a loop to store the data
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		//Creating array to to store reverse oder of array 1
		int [] arr2 = new int [arr1.length];
		//Creating a loop to store the data
		for(int i=0;i<=arr2.length-1;i++)
		{
			arr2[arr1.length-1-i]=arr1[i];
		}
		//displaying original array  incrementing by 3
		System.out.println("The Original array is : ");		
		for(int i=0;i<=arr1.length-1;i++)
		{
			System.out.print(arr1[i]+3+" ");

		}
		System.out.println();
		//displaying original array  decrementing by 5
		System.out.println("The Reverse array is : ");
																																																																																																																																																																																																																																																																																																																																																																																																															
		for(int i=0;i<=arr2.length-1;i++)
		{
			System.out.print(arr2[i]-5+" ");

		}
		//Closing of scanner class
		sc.close();
	}

}
