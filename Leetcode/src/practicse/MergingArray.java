package practicse;

import java.util.*;

public class MergingArray {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,4};
		int arr2[]= {5,6,7,8};
		List<Integer>lists=new ArrayList<Integer>();
		//method 1 
		for(int e:arr1)
		{
			lists.add(e);
		}
		System.out.println(lists);
		for(int e:arr2)
		{
			lists.add(e);
		}
		System.out.println(lists);
		
//m2
		List<Integer>list2=new ArrayList<Integer>();
		for(int a:arr1)
		{
			Collections.addAll(list2,a);
		}
		for(int a:arr2)
		{
			Collections.addAll(list2,a);
		}
		
		
		System.out.println("list 2"+list2);
	}

}
