package gfg;
import java.util.*;
public class MoveZeroesToFront {
public static void approach1(int arr[],int n)
{
	List<Integer>lists=new ArrayList<Integer>();
	for(int i=0;i<n;i++)
	{
		if(arr[i]==0)
		{
			lists.add(0);
		}
	}
	for(int i=0;i<n;i++)
	{
		if(arr[i]!=0)
		{
			lists.add(arr[i]);
		}
	}
	System.out.println(lists);
}//approach1 ends here
public static void approach2(int arr[],int n)
{
	
}
	public static void main(String[] args) {
		int arr[]= {0,1,0,2,0,3,2,0,0,4,5,1};
		int n=arr.length;
		approach1(arr, n);
	}

}
