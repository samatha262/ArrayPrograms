package com.learn.Arrays;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
	//Creating object of Scanner class 
    Scanner sc=new Scanner(System.in);
    //Creating an array
    boolean[] backlogs=new boolean[8];
    //initializing a variable called status
    String status;
    //Creating a loop of range 0 to backlogs.lenth-1
    for(int i=0;i<=backlogs.length-1;i++)
    {
    	//displaying a msg to take user input
    	System.out.println("Do you have backlogs in "+(i+1)+" Semester? ");
    	//Reading user input
    	status=sc.next();
    	//Condition to check whether the student having backlogs or not
    	if(status.equals("yes"))
    	{
    		backlogs[i]=true;
    	}
    	else
    	{
    		backlogs[i]=false;
    	}
    }
    //Creating a loop of range 0 to backlogs.lenth-1
    for(int i=0;i<=backlogs.length-1;i++)
    {
    	//Displaying the backlogs status of the student
    	System.out.println("The status of the semester "+(i+1)+" is " + backlogs[i]);
    }
    //closing of the scanner class
    sc.close();
	}

}
