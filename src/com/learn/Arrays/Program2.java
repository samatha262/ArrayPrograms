package com.learn.Arrays;

public class Program2 {

	public static void main(String[] args) {
		//Creating an array
		String[] nameEmp=new String[7];
		//Storing employee names in array
		nameEmp[0]="Samatha";
		nameEmp[1]="Kiran";
		nameEmp[2]="Nehal";
		nameEmp[3]="Chethan";
		nameEmp[4]="Asha";
		nameEmp[5]="Jyothi";
		nameEmp[6]="Sindu";
		//Displaying the employ names stored in array
		System.out.println("The employee names are :");
		/* code Redundancy Occurs
		System.out.println("Employee 1 : "+nameEmp[0]);
		System.out.println("Employee 2 : "+nameEmp[1]);
		System.out.println("Employee 3 : "+nameEmp[2]);
		System.out.println("Employee 4 : "+nameEmp[3]);
		System.out.println("Employee 5 : "+nameEmp[4]);
		System.out.println("Employee 6 : "+nameEmp[5]);
		System.out.println("Employee 7 : "+nameEmp[6]); */
		for (int i=0;i<=nameEmp.length-1;i++)
		{
			System.out.println(nameEmp[i]);
		}
	
	}

}
