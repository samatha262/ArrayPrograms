package com.learn.Arrays;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		//Creating object of the scanner class
		Scanner sc=new Scanner(System.in);
		//Creating an array
		int [][] stdMarks =new int[3][4];
		//creating a loop for number of classrooms of range 0 to 2
		for(int i=0;i<=2;i++)
		{
			//Condition for terminating loop
			if(i==1)
			{
				break;
			}

			//Creating loop for marks of students of range 0 to 3
			for(int j=0;j<=3;j++)
			{
				//displaying msg to to enter the marks of students of classroom 1
				System.out.println("Enter the Marks of student "+(j+1)+" of classroom : "+(i+1));
				//Reading and storing the user data
				stdMarks[i][j]=sc.nextInt();
			}
			//Creating loop for marks of students of range 0 to 1
			for(int j=0;j<=1;j++)
			{
				//displaying msg to to enter the marks of students of classroom 2
				System.out.println("Enter the Marks of student "+(j+1)+" of classroom : "+(i+2));
				//Reading and storing the user data
				stdMarks[i][j]=sc.nextInt();				
			}
			//Creating loop for marks of students of range 0 to 2
			for(int j=0;j<=2;j++)
			{
				//displaying msg to to enter the marks of students of classroom 3
				System.out.println("Enter the Marks of student "+(j+1)+" of classroom : "+(i+3));
				//Reading and storing the user data
				stdMarks[i][j]=sc.nextInt();
			}
		}
		//creating the loop for classrooms
		for(int i=0;i<=2;i++)
		{
			//condition to terminate the loop
			if(i==1)
			{
				break;
			}
			//Creating loop for marks of students of range 0 to 3
			for(int j=0;j<=3;j++)
			{
				//Displaying the marks of students of classroom 1
				System.out.println("Marks of student "+(j+1)+ " of classroom "+(i+1)+ " is: " +stdMarks[i][j]);
			}
			//Creating loop for marks of students of range 0 to 1
			for(int j=0;j<=1;j++)
			{
				//Displaying the marks of students of classroom 2
				System.out.println("Marks of student "+(j+1)+ " of classroom "+(i+2)+ " is: " +stdMarks[i][j]);
			}
			//Creating loop for marks of students of range 0 to 2
			for(int j=0;j<=2;j++)
			{
				//Displaying the marks of students of classroom 3
				System.out.println("Marks of student "+(j+1)+ " of classroom "+(i+3)+ " is: " +stdMarks[i][j]);
			}
		}
		//Closing of scanner class
		sc.close();

	}

}
