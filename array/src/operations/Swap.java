package operations;

import java.util.Arrays;
//this is basically a bubble sort
public class Swap {
	
	public static void swap(int arr[])
	{//10,20,2,3
		int n=arr.length;
		int temp=0;
		
		for(int i=0;i<arr.length-1;i++)//1
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				
				if(arr[j]>arr[j+1]) {//20>2
					temp=arr[j];//20
					arr[j]=arr[j+1];//2
					arr[j+1]=temp;//20
				}
			}
		//time complexity n2
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void second(int arr[]) {
		
	}

	public static void main(String[] args) {
		
int arr[]= {10,20,2,3};
System.out.println(Arrays.toString(arr));
Swap.swap(arr); 
Swap.second(arr);
	}
}


