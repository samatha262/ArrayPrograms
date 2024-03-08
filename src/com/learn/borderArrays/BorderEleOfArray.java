package com.learn.borderArrays;

import java.util.Scanner;

public class BorderEleOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of rows in array: ");
		int rows=sc.nextInt();
		System.out.println("Enter the number of colm in array: ");
		int colm=sc.nextInt();
		int arr [][]= new int[rows][colm];
		System.out.println("Enter the elements of a array: ");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				arr[i][j]=sc.nextInt();
			}		
		}
		System.out.println("The border elements of the array are: ");
		for(int i=0;i<=arr.length-1;)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			i++;
			for(int j=arr.length-1;j>=2;j--)
			{
				System.out.print(arr[i][j]+" ");
			}
			i++;
			for(int j=arr.length-1;j>=0;j--)
			{
				System.out.print(arr[i][j]+" ");
			}
			i--;
			for(int j=0;j<arr.length-j-1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			break;
		}
		
	}
}


