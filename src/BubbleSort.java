import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		//creating object of scanner class
		Scanner sc = new Scanner(System.in);
		//displaying a msg to enter size of array
		System.out.println("Enter the length of the array: ");
		//reading input from user
		int arr[]= new int[sc.nextInt()];
		//displaying a msg to enter the elements of the array
		System.out.println("Enter the array elements: ");
		//creating a loop to store the array elements
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		//creating a loop for sorting array
		for(int i=0;i<=arr.length-2;i++)
		{
			for(int j=0;j<=arr.length-2-i;j++)
			{
				//condition to swap element 
				if(arr[j]>arr[j+1])
				{
					int temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		//displaying sorted array
		System.out.println("The sorted array is: ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		//closing of scanner class
		sc.close();
	}

}
