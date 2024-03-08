import java.util.Scanner;

public class LinearSearch3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//displaying a msg to enter the size of the array
		System.out.println("Enter the size of array ");
		//reading input from the user
		int arr []= new int[sc.nextInt()];
		//displaying a msg to enter array elements
		System.out.println("Enter the array elements: ");
		//creating loop to store the array elements
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		//Displaying a msg to enter the element to be searched
		System.out.println("Enter the element to be searched: ");
		//reading the key element
		int key = sc.nextInt();
		int index=-1;
		//creating a loop to search whether the element is present or not
		for(int i=0;i<=arr.length-1;i++)
		{
			//condition check for searching key element
			if(arr[i]==key)
			{
				index=i;
			}
		}
		if(index==-1)
		{
			System.out.println("Key not found");
		}
		else
		{
		System.out.println(key + " found in the array & last occurance @ index "+index);
		sc.close();
	}

	}
}


