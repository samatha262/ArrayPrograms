package com.learn.Primearrays;

public class PrimeNumbers {

	public static void main(String[] args) {
		//Creating a array
		int a[]= {2,3,4,5,6,7,8,9};
		System.out.println("the prime numbers in given array is: ");
		//creating a loop to find prime numbers
		for(int i=0;i<=a.length-1;i++)
		{
			//initializing a value count
			int count=0;
			//creating a loop for diving number of range 1 to a[i]
			for(int j=1;j<=a[i];j++)
			{
				if(a[i]%j==0)
				{
				count++;	
				}
			}
			//condition to check prime number
			if(count==2)
			{
				//displaying prime numbers
				System.out.print(a[i]+" ");
			}
	
		}

	}

}
