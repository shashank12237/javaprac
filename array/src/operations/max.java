package operations;
import java.util.*;
public class max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of array ");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		
		for(int  i=0;i<a.length;i++) {
			System.out.println("enter the element at index "+i);
			a[i]=sc.nextInt();
		}
		//displaying our array
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
	//	int arr[]= {5,88,99,6};
		Maximum.largest(a);
		System.out.println("The largest numbr is "+Maximum.maxi);
		Maximum.reverse(a);
		
	Integer arr[]= new Integer[n];
	for(int  i=0;i<a.length;i++) {
		arr[i]=a[i];
	}

		Maximum.reverse_collection(arr);
	}

}
