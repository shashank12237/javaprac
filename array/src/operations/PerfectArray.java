package operations;

import java.util.Arrays;

public class PerfectArray {
	public static boolean IsPerfect(int a[], int n)
	    {
	       int b[]=new int[n];
	       
	       for(int i=0;i<n;i++)
	       {
	           b[n-1-i]=a[i];
	       }
	       System.out.println(Arrays.toString(b));
	       if(a.equals(b))
	       return true;
	       else
	       return false;
	    }
	public static void main(String[] args) {
	   
		int arr[]= {1,2,3,2,1};
		int n=arr.length;
		System.out.println(IsPerfect( arr,  n));
	    }

	}


