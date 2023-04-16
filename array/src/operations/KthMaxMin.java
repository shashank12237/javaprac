package operations;
import java.util.*;

public class KthMaxMin {

	public static void maximum(int arr[])
	{
		Arrays.sort(arr);
		//for(int i=0;)
	}
	public static void minimum(int arr[])
	{
		Arrays.sort(arr);
		Arrays.toString(arr);
	}
	public static void main(String args[]) {
		
		int arr[]= {3,2,88,45,69,33};
	//	System.out.println("Enter the kth max num");
		Scanner sc =new Scanner(System.in);
	//	int m= sc.nextInt();
		maximum(arr);
	//	System.out.println("Enter the kth min num");
	//	int n=sc.nextInt();
		minimum(arr);
	}
}
