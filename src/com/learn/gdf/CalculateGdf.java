package com.learn.gdf;

public class CalculateGdf {

	public static void main(String[] args) {
		//Creating a array
		int a[]= {2,3,4,5,6,7};
		
		System.out.println("the gcd of element  1st & 4Th  is: ");
		//element 1 @ index 0
			int ele1=a[0];
			//element 4 @ index 3
			int ele4=a[3];
		//creating loop for calculating gdc of 1St and 4th elements
		while(ele4>0)
		{
			//creating a temporary variable and storing ele4 in temp
			int temp=ele4;
			//finding the reminder of eley4 and ele1 and storing it in ele4
			ele4=ele4%ele1;
			//assigning temp value to the ele1
			ele1=temp;
		}
		//method to calculate absolute positive number
		int gdc=Math.abs(ele1);
		//printing the output
		System.out.println(gdc+"");
		}
	}

