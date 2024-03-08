import java.util.Scanner;

public class BubbleSort1 {

	public static void main(String[] args) {
		//creating object of the scnnner class
		Scanner sc = new Scanner (System.in);
		//displaying a msg to enter the size of the array
		System.out.println("Enter the size of the array: ");
		//creating a array
		int arr []=new int[sc.nextInt()];
		//displaying a msg to enter the array elements
		System.out.println("Enter the array elements: ");
		//creating a loop and storing array elements
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		//displaying a msg to enter the key element
		System.out.println("Enter the key element: ");
		//reading and storing user data 
		int key=sc.nextInt();
		//involking a method to check array sorted or not 
		if(checkArraySorting(arr))
		{
			//displaying a msg if array is sorted
			System.out.println("The array is already sorted."); 
		}
		else
		{
			//involking bubble sort method whether array is sorted or not
			bubbleSort(arr);
			//displaying sorted array
			System.out.println("The sorted array is: ");
			for(int i=0;i<=arr.length-1;i++)
			{
			System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		//involking binary search method
		binarySearch(arr,key);
		//closing sacnner class
		sc.close();
		
	}
	public static boolean checkArraySorting(int[]arr)
	{
		//creating a loop to check whether is array sorted or not
		for(int i=0;i<arr.length-1;i++)
		{
				if(arr[i]>arr[i+1])
				{
					return false;
				}
			}
		
		return true;
	}
	public static int[] bubbleSort(int[]arr)
	{
		//loop for sorting array
		for(int i=0;i<=arr.length-2;i++)
		{
			for(int j=0;j<=arr.length-2-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}

		}

		return arr;
	
	}
	public static void binarySearch(int[]arr,int key)
	{
		//initializing variables low and high
		int low=0,high=arr.length-1;
		//creating a loop for binary search
		while(low<=high)
		{
			//finding the mid value
			int mid = (low+high)/2;
			//checking whether arr[mid] is equal to key
			if(arr[mid]==key)
			{
				System.out.println("key found @ index "+mid);
				return;
			}
			//comparing key with arr[mid] 
			else if(key>arr[mid])
			{	
				//if greater
				low=mid+1;
			}
			else
			{
				//if lesser 
				high=mid-1;
			}
		}
		System.out.println("key not found");
	}
}
