package com.learn.checkarray;

public class CheckDuplicateElements {

	public static void main(String[] args) {
		//Creating a array 
		int a[]= {2,3,4,5,3,2,6};
		System.out.println("The duplicate elements in the array are: ");
		//creating a loop to check the duplicate values in array of range 0 to a.lenth
		for(int i=0;i<=a.length-1;i++)
		{
			//this loop compares values each other
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					//displaying the duplicate values
					System.out.print(a[i]+" ");
					//to avoid printing multiple values multiple times
					break;
				}
			}
		}
  }
}
