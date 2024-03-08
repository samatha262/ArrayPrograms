package com.learn.Arrays;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
	//Creating object of a scanner class o
    Scanner sc=new Scanner(System.in);
    //Displaying msg to enter the number of players
    System.out.println("Enter the number of players");
    //Reading the user input
    int n=sc.nextInt();
    //Creating an array
    float[] height=new float[n];
    //Creating loop of range 0 to height.length-1
    for (int i=0;i<=height.length-1;i++)
    {
    	//Displaying a msg to enter the heights of players
        System.out.println("Enter the heights of players :"+(i+1));
        //reading the input from the user
        height[i]=sc.nextFloat();
     }
    //Creating loop of range 0 to height.length-1

    for (int i=0;i<=height.length-1;i++)
    {
    	//Displaying the heights of the players
    	System.out.println("The height of player "+ (i+1)+" is " + height[i]);
    }
    //Closing of Scanner class
    sc.close();
	}

}
