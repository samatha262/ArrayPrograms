package com.learn.borderArrays;

import java.util.Scanner;

public class ClockWise {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array: ");
	int a[][]=new int[sc.nextInt()][sc.nextInt()];
	System.out.println("Enter the elements of the array: ");
	for(int i =0;i<=a.length-1;i++)
	{
		for(int j=0;j<=a[i].length-1;j++)
		{
			a[i][j]=sc.nextInt();
		}			
	}
	System.out.println("The Border elments of array");
	for(int i =0;i<=a.length-1;i++)
	{
		for(int j=0;j<=a[i].length-1;j++)
		{
			if(i==0)
			{
				System.out.print(a[i][j]+" ");
			}			
		}
		i++;
		for(int j=a[i].length-1;j>=0;j--) 
		{
			if(j==2)
			{
			System.out.println(a[i][j]+" ");
			}
			i++;
		}
		
		
		
		
		
		
		}

	
				
	}

	}

