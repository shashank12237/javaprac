package gfg;
import java.util.*;
public class LeftRotateArray {
	public static void rotate(int arr[],int d) {
		int n=arr.length;
		int rotated[]=new int[n];
		int count=0;
		while(count!=d)
		{
			int swap=arr[0];
			for(int i=1;i<n;i++) {
				rotated[i-1]=arr[i];
			}
			rotated[n-1]=swap;
			arr=rotated;
			count++;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of d ");
		int d=sc.nextInt();
		int temp[]=new int[d];
		//step 1 ==> saving the values upto d which have to be rotated at end of array
		for(int i=0;i<d;i++) {
			temp[i]=arr[i];
		}
		//System.out.println(Arrays.toString(temp));
		//step2==> rotating array from d index to d positn left
		for(int i=d;i<arr.length;i++)
		{
			arr[i-d]=arr[i];
			/*
			 * let d=3
			 * index 3 ==> index 0    ==>arr(i-d)=arr(i)==>arr(3-3=0)==>arr(3)
			 * index 4==> index 1
			 * 
			 */
		}
		//step 3 shifting the temp arr elements to back of array
		/*
		 * let d=3
		 * i=n-d <==itertn begins from
		 * arr[i]=temp[i-(n-d)]
		 */
		int n=arr.length;
		for(int i=n-d;i<n;i++)
		{
			arr[i]=temp[i-(n-d)];
		}
		System.out.println(Arrays.toString(arr));
//		System.err.println("via approach 2 ");
//		rotate(arr,d);
	}

}
