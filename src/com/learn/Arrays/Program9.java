package com.learn.Arrays;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of states");
		int state = sc.nextInt();
		System.out.println("Enter the number of cities");
		int cities = sc.nextInt();
		System.out.println("Enter the number of persons");
		int persons = sc.nextInt();
		int[][][] personAge = new int[state][cities][persons];
		for(int i=0;i<=personAge.length-1;i++)
		{
		for(int j=0;j<=personAge[i].length-1;j++)
		{
			for(int k=0;k<=personAge[i][j].length-1;k++)
			{
				System.out.println("Enter the age of state " +(i+1)+ " of city "+(j+1)+" of person "+(k+1));
				personAge[i][j][k]=sc.nextInt();			}
		}
		
		}
		for(int i=0;i<=personAge.length-1;i++)
		{
		for(int j=0;j<=personAge[i].length-1;j++)
		{
			for(int k=0;k<=personAge[i][j].length-1;k++)
			{
				System.out.print("The age of person "+(k+1)+" of city "+(j+1)+ " of state "+(i+1)+" is: ");
				System.out.println(" " +personAge[i][j][k]+" ");
			}
			System.out.println();
		}
		}
		sc.close();
	}

}
