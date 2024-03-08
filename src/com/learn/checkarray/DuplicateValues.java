package com.learn.checkarray;

import java.util.Scanner;

public class DuplicateValues {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the length of the array: ");
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The duplicate values in the array are: ");
		for(int i=0;i<=arr.length-1;i++)	
		{	
			for(int j=i+1;i<=arr.length-1;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[i]+" ");
					break;
				}
			}
		}
		sc.close();

	}

}
