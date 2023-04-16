package gfg;

import java.util.ArrayList;

public class TableViaArrayList {

	public static ArrayList<Integer> getTable(int n)
	{
		int arr[]=new int[10];
		
		for(int i=1;i<=10;i++)
		{
			arr[i-1]=n*i;
		}
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int a:arr) {
			list.add(a);
		}
		return list;
		
	}
	public static void main(String[] args) {
		int n=20;
		
		System.out.println(getTable(n));
		

	}

}
