package gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetToArray {

	public static void main(String[] args) {
		int x=5;int count=0;
		Set<Integer>set=new HashSet<Integer>();
		int arr[]= {1,2,44,9,55,44,44};
		for(int v:arr) {
			set.add(v);
		}
		System.out.println(set);
		
		int y=set.size();
		int[] brr=new int[y];
	    
	   
		int z=0;
		for(Integer c:set)
		{
			brr[z++]=c;
		}
		Arrays.sort(brr);
		System.out.println(Arrays.toString(brr));
	}
		}

	


