import java.util.Scanner;

public class LinearSearch2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//displaying a msg to enter the size of the array
		System.out.println("Enter the size of array ");
		//reading input from the user
		int arr[][]= new int[sc.nextInt()][sc.nextInt()];
		//displaying a msg to enter array elements
		System.out.println("Enter the array elements: ");
		//creating loop to store the array elements
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
			arr[i][j]=sc.nextInt();
			}
		}
		//Displaying a msg to enter the element to be searched
		System.out.println("Enter the element to be searched: ");
		//reading the key element
		int key = sc.nextInt();
		//creating a loop to search whether the element is present or not
		for(int[]rows : arr)
		{
			for(int ele :rows)
			{
			//condition check for searching key element
			if(ele==key)
			{
				System.out.println("Key is found");
				return;
			}			
		}
	}
		System.out.println("Key not found");
		sc.close();
	}

	}


