package com.learn.reversearray;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array1 : ");
		int [] arr1 = new int [sc.nextInt()];
		System.out.println("Enter the elements of the array1 : ");
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		int [] arr2 = new int [arr1.length];
		for(int i=0;i<=arr2.length-1;i++)
		{
			arr2[arr1.length-1-i]=arr1[i];
		}
		System.out.println("The reverse orders array is : ");
		
		for(int i=0;i<=arr2.length-1;i++)
		{
			System.out.println(arr2[i]);

		}




	}

}
