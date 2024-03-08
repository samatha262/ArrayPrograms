package com.learn.Arrays;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter the length of the array");
	int[] Arr1 = new int[sc.nextInt()];
	int[] Arr2 =new int[Arr1.length];
	System.out.println("Enter the elements of Arr1");
	for(int i=0;i<=Arr1.length-1;i++)
	{
		Arr1[i]=sc.nextInt();
		Arr2[i]=Arr1[i];
	}
	System.out.println("The elements of Arr1");
	for(int i=0;i<=Arr1.length-1;i++) {
		System.out.println(Arr1[i]+ " ");
		
	}
	System.out.println("The elements of Arr2");
	for(int i=0;i<=Arr1.length-1;i++) {
			System.out.println(Arr2[i]+ " ");
			

	}
	sc.close();
	
	}

}
