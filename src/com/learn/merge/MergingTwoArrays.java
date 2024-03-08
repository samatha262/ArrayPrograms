package com.learn.merge;

import java.util.Scanner;

public class MergingTwoArrays {

	public static void main(String[] args) {
		//Creating object of scanner class
		Scanner sc = new Scanner(System.in);
		//Displaying a msg to enter the size of array1
		System.out.println("Enter the size of the array 1");
		//Reading the input from the user
		int [] arr1 = new int[sc.nextInt()];
		//Displaying a msg to enter the size of array1
		System.out.println("Enter the elements of array 1");
		//Creating a loop to read the array elements of range 0 to arr1.length
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		//Displaying a msg to enter the size of array2
		System.out.println("Enter the size of array 2");
		//Reading the input from the user
		int [] arr2 = new int[sc.nextInt()];
		System.out.println("Enter the elements of array 2");
		//Creating a loop to read the array elements of range 0 to arr1.length
		for(int i=0;i<=arr2.length-1;i++)
		{
			arr2[i]=sc.nextInt();
		}
		//Creating array 3 to merge two arrays
		int [] arr3 =new int [arr1.length+arr2.length];
		//Creating loop for merging two arrays
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr3[i]=arr1[i];
		}
		for(int j=0;j<=arr2.length-1;j++)
		{
			arr3[arr1.length+j]=arr2[j];
		}
		//displaying the merged array
		System.out.println("The merged array is :");
		for(int i=0;i<=arr3.length-1;i++)
		{	
		System.out.print(arr3[i]+" ");

	}
		sc.close();
}
}
