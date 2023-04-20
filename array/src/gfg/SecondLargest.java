package gfg;

import java.util.Arrays;

public class SecondLargest {

	public static void brute(int a[]) {
		//first we will sort our array via bubble sort
		int temp=0;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1])
				{
					temp=a[j]; 
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}//innr for	
		}//outr for
		//Time comple: o(n2)
		System.out.println(Arrays.toString(a));
		//second step
		
		int n=a.length;
		int largest=a[n-1];//aftr sorting we know that last ele will be largst
		int second=0;//we have to find this
		for(int i=n-2;i>0;i--)
		{//itrtng loop from n-2 to 0 to check fr our sec largest
			if(a[i]!=largest) {
				second=a[i];
				break;
			}
			//Time comp o(N)
		}
		System.out.println(second);
		//overall time comp o(N2+N)==>o(N2)
	}
	/*
	 * approach 3
	 * class Solution {
    int print2largest(int arr[], int n) {
        int temp=0;
        Arrays.sort(arr);//12 35 1 10 34 1
        for(int i=n-1;i>=1;i--)
        {
            if(arr[i]!=arr[i-1])
            {
                temp=arr[i-1];
                 return temp;
                
            }
        }
        return -1;
    }best
}
	 */
	public static void second(int a[])
	{
		int n=a.length;
		int largest=a[0];
		for(int i=1;i<n;i++) {
			if(a[i]>largest)
			{
				largest=a[i];
			}
		}//Time comp o(N)
		//System.out.println("largest nbr is "+largest);
		int sec_larg=-1;
		for(int i=0;i<n;i++)
		{
			if(a[i]>sec_larg && a[i]!=largest)
			{
				sec_larg=a[i];
			}
		}//Time comp o(N)
		System.out.println("Second largest is "+sec_larg);//overall time comp o(N+N)==>o(N)
	}
	public static void main(String[] args) {
		int arr[]= {1,9,7,8,8,3,2};
		int brr[]= {1,9,7,8,8,3,2,10,10,10};
		System.out.println("for first inpt");
		brute(arr);
		System.out.println("for sec inpt");
		brute(brr);
		System.out.println("for first inpt");
		second( arr);
		System.out.println("for sec inpt");
		second( brr);
		
		
	}

}
