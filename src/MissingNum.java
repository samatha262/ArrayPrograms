
public class MissingNum {

	public static void main(String[] args) {
		int [] arr= {1,2,3,5,6};
		int ele=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			ele=i+1;
			if(arr[i]!=ele)
			{
				System.out.println("missing no is: "+ele );
				return;
			}
		}

	}

}
