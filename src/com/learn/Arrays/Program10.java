package com.learn.Arrays;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array");
	int[] findEle = new int[sc.nextInt()];
	System.out.println("Enter the elements of the array");
	for(int i=0;i<=findEle.length-1;i++)
    findEle[i]=sc.nextInt();	
	System.out.println("Enter the element to be searched");
	int key=sc.nextInt();
	for(int i=0;i<=findEle.length-1;i++)
	{
	if(findEle[i]== key)
	{
		System.out.println("Key "+key+" found @ index " + i);
		return;
	} 
	}
	System.out.println("Key "+key+" not found");
	sc.close();
	}                                     
	
	}


