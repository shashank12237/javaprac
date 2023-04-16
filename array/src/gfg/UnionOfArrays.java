package gfg;
import java.util.*;



public class UnionOfArrays {
public static void approach1(int[] arr1,int arr2[]) {
	Set<Integer>set1=new TreeSet<Integer>();
	//Set<Integer>set2=new HashSet<Integer>();
	for(int i:arr1)
		{
		set1.add(i);
		}
	for(int i:arr2)
		{
			set1.add(i);
		}
	//set1.addAll(set2);
	//Collections.sort(set1);
	Integer brr[]=new Integer[set1.size()];
	set1.toArray(brr);
	
	System.out.println(Arrays.toString(brr));
}
	public static void main(String[] args) {
		int arr1[]= {1,1,2,6,3,4,4,8,8,9,9,7,7};
		int arr2[]= {1,0,2,26,63,34,4,8,8,9,9,7,7};
		approach1(arr1,arr2);
	}

}
