import java.util.Scanner;

public class ArraySwap {

	public static void main(String[] args) {
		//creating object of scanner class
		Scanner sc = new Scanner (System.in);
		//displaying a msg to enter size of array
		System.out.println("Enter the size of array ");
		//reading input from user
		int arr [] = new int[sc.nextInt()];
		//displaying a msg to enter array elements
		System.out.println("Enter the array elements: ");
		//creating a loop to store array elements
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}	
		//displaying a msg to enter index of 1st element
		System.out.println("Enter index of 1st element: ");
		//reading and storing it in  variable 'a'
		int a=sc.nextInt();
		//displaying a msg to enter index of 2nd element
		System.out.println("Enter the index of 2nd element: ");
		//reading and storing it in  variable 'b'
		int b=sc.nextInt();
		//condition to check whether the indexes in the range of array 
		if(a<0||a>arr.length||b<0||b>arr.length)
		{
			System.out.println("Invalid input");	
		}
		else
		{
			if(a==b)
			{
			System.out.println("Same indexes are not allowed");	
			}
			else
			{
		//displaying array before sorting
		System.out.println("Array before swapping: ");
		for(int i=0;i<=arr.length-1;i++)
		{
		System.out.print(arr[i]+" ");
		}
		//logic for swapping of two elements
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
		System.out.println();
		//displaying array after swapping
		System.out.println("Array after swapping: ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		}
		}
		//closing of scanner class
		sc.close();
	}

}
