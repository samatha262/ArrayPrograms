/* Java program to illustrate Insertion Sorting */
package com.learn.Insertionsort;

import java.util.Scanner;

public class Insertionsorting {

	public static void main(String[] args) {
		//object of the scanner class
		Scanner sc = new Scanner(System.in);
		//siaplaying a msg to enter the size of the array
		System.out.println("Enter the size of the array ");
		//Reading user input
		int arr[] = new int[sc.nextInt()];
		//displaying a msg to enter array elements
		System.out.println("Enter the elements of the array ");
		//creating a loop to read & store array elements
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Before Sorting :");
		for(int ele :arr)
		{
			System.out.print(ele+" ");
		}
		System.out.println();
		//Insertion Sorting
		for(int i=1;i<=arr.length-1;i++)
		{
			int key =arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>key)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
		//displaying array elements after sorting
		System.out.println("After sorting : ");
        for(int ele: arr)
        {
        	System.out.print(ele+" ");
        }
        sc.close();
	}

}
