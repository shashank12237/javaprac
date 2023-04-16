package gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ArraytoHashSet {

	public static void main(String[] args) {
		int x=5;int count=0;
	Set<Integer>set=new HashSet<Integer>();
	int arr[]= {1,2,44,9,55,44,44};
	for(int v:arr) {
		set.add(v);
	}
	System.out.println(set);
	ArrayList<Integer>list=new ArrayList<Integer>(set);
	Collections.sort(list);
	System.out.println(list);
	for(Integer s:list)
	{
		if(s<x)
			count++;
	//	System.out.println(list);
	}
//	int y=set.size()-1;
//	int brr[]=new int[y];
////	set.toArray(brr);
//	int z=0;
//	for(Integer c:set)
//	{
//		brr[z++]=c;
//	}
////	for(int i=0;i<brr.length;i++)
//	{
////		if(brr[i]<x)
////		{
////			count++;
////		}
//		System.out.print(brr[i]+" ");
//	}
	System.out.println(count);
	
//	for(int i=0;i<set.size();i++)
//	{
////		if(set.containsAll())
//	}
	}

}
