package operations;
import java.util.*;
public class IgnoreLargestTwoElements {

	public static void main(String[] args) {
//		System.out.println("Enter the length of array ");
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int arr[]=new int[n];
int arr[]= {1,40,20,3,99,25,99,40,40};
Arrays.sort(arr);
int n =arr.length;
int f_max=arr[n-1];
int s_max=arr[n-2];
for(int i=0;i<n;i++)
{
	if(arr[i]<f_max && arr[i]<s_max)
	{
		System.out.print(arr[i]+" ");
	}
}
	}

}
