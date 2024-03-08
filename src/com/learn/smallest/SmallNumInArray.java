package com.learn.smallest;

public class SmallNumInArray {

	public static void main(String[] args) {
		int a[]= {2,3,4,5,6};
		System.out.println("The smallest number in given arrays is: ");
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=1;j<=a.length-j-1;j++)
			{
				if(a[i]<a[j])
				{
					System.out.println(a[i]);
					return;
					
					
				}
			}
		
		}

	}

}
