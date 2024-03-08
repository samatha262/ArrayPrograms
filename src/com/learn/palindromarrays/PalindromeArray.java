package com.learn.palindromarrays;

public class PalindromeArray {

	public static void main(String[] args) {
		int arr[]= {121,123,131,142,454};
	//System.out.println("The number of palindrome values in give array is: ");
		System.out.println("The palindrome values in array are: ");
		//Creating a loop of range 0 to arr.length
		int count=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			//initializing the variables  
			int digit=0,rev=0,originalnum=arr[i];
			//Creating a loop to whether the element is palindrome or not
			while(arr[i]>0)
			{
				//finding the last digit of the element
				digit=arr[i]%10;
				//removing the last digit of the element
				arr[i]=arr[i]/10;
				
				rev=rev*10+digit;
				//condition to check whether the rev number is equal to original number or not
				if(originalnum==rev)
				{
					//displaying the palindromes in the array
					System.out.print(rev+" ");
				}
			}	
		
		}
	}
}



