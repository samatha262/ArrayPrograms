package com.learn.array1;

import java.util.Scanner;

public class Array3D {

	public static void main(String[] args) {
		//Creating object of scanner class
		Scanner sc = new Scanner (System.in);
		//Creating an array
		System.out.println("enter the number of school");
		double[][][] percent = new double[sc.nextInt()][][] ;
		for(int i =0;i<=percent.length-1;i++)
		{
			System.out.println("enter the number classes of school : "+(i+1));
			percent[i]=new double[sc.nextInt()][];
		}
		for(int i =0;i<=percent.length-1;i++)
		{
			for(int j =0;j<=percent[i].length-1;j++)
			{
				System.out.println("enter the number students of school "+(i+1)+" of class: "+(j+1));
				percent[i][j]=new double[sc.nextInt()];
			}
		
		}
		//Storing the data into the array
		for(int i =0;i<=percent.length-1;i++)
		{
			for(int j =0;j<=percent[i].length-1;j++)
			{
				for(int k =0;j<=percent[i][j].length-1;k++)
				{
		
				System.out.println("enter the percentage of school "+(i+1)+" of class "+(j+1)+" of student: "+(k+1));
				percent[i][j][k]=sc.nextDouble();
			}
			}
	}
		//Displaying the data in array
			for(int i =0;i<=percent.length-1;i++)
			{
				for(int j =0;j<=percent[i].length-1;j++)
				{
					for(int k =0;j<=percent[i][j].length-1;k++)
					{
			
					System.out.println("The percentage of school  "+(i+1)+" of class "+(j+1)+" of student: "+(k+1)+" is :"+percent[i][j][k]);	
				}
					System.out.println();

		}

	}
			
		//Closing of scanner class
			sc.close();
   }
  }
