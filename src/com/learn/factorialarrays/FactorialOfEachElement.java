package com.learn.factorialarrays;

public class FactorialOfEachElement {

	public static void main(String[] args) {
		//creating a array
		int a[]= {1,2,3,4,5,6};
		System.out.println("The factorial of each element of array is: ");
		//creating a loop of range 0 to a.length-1;
		for(int i=0;i<=a.length-1;i++)
		{
			//initializing the variable 
			int fact=1;
			//Creating the loop for for calculating factorial
			for(int j=1;j<=a[i];j++)
			{
			//condition to calculate factorial of element of array 
			fact *= j;
		}
			//displaying factorial of each elements
		System.out.println("factorial of " +a[i]+ "is "+fact);
		}
	}

}
