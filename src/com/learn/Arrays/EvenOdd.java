package com.learn.Arrays;

public class EvenOdd {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8};
		int count =0;
		int count1=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				count++;
			}
			else 
			{
				count1++;
			}
		}
		System.out.println("The number of even numbers in given array is: "+count);
		System.out.println("The number of odd numbers in given array is: "+count1);

		}

}
