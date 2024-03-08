package com.learn.Arrays;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String [][] empName = new String [3][5];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<5;j++)
				
			{
			System.out.println("Enter the employee "+(j+1)+ " names of Company: " +(i+1));
			    empName[i][j]=sc.next();
			}

		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<5;j++)
				
			{
			
			System.out.println("The Employee names of company : "+(i+1)+ " " +empName[i][j]);

			}

		}
      sc.close();

	}

}
