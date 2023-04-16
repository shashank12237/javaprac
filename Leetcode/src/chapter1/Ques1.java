package chapter1;
import java.util.*;
public class Ques1 {
	public static void rotate(int arr[],int k)
	{
		int n=arr.length;
		k=k%n;
		reverse(arr,0,n-1);
	}
	
	private static void reverse(int[] arr, int start, int end) {
		// to reverse an array
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=arr[start];
			start++;
		}
	}	

	public static void main(String[] args) {
		/*
		 * Rotate an array of n elements to the right by k steps. For example, with n
= 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
How many different ways do you know to solve this problem?
		 */
System.out.println("enter tghe length of array");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

int arr[]=new int[n];
System.out.println("enter the array elemnts of length n ");
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
}
System.out.println();

System.out.println("enter tyhe index from where u want to rfotate the array");
int k =sc.nextInt();
//rotate(arr[],k);
for(int i=0;i<n;i++)
{
	System.out.print(arr[i]+" ");
}
		
	
	}
}
