package com.learn.Arrays;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter the length of the array");
	int[] Arr1 = new int[sc.nextInt()];
	System.out.println("Enter the elements of Arr1");
	for(int i=0;i<=Arr1.length-1;i++)
	{
		Arr1[i]=sc.nextInt();
	}
	int[] Arr2 =new int[Arr1.length];
	for(int i=0;i<=Arr1.length-1;i++)

	{
	
		Arr2[Arr1.length-1-i]=Arr1[i];
	}
	System.out.println("The elements of Arr1");
	for(int i=0;i<=Arr1.length-1;i++) {
		System.out.print(Arr1[i]+ " ");
	}
		System.out.println("The elements of Arr2");
		for(int i=0;i<=Arr1.length-1;i++)
		{

			System.out.print(Arr2[i]+ " ");

	}
		sc.close();
	}

	}


