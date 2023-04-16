package operations;

import java.util.Arrays;

public class DuplicayChecking {

	public static void main(String[] args) {
		int arr[]= {10,20,10,23,60,23,60,23,23};
		// using brutal force 
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length-1;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
				{
					
					count++;
					
					//System.out.println("number "+arr[j]+" times repeated "+count);
					
				}
				
				else
					break;
			}
			if(count>1) {
				System.out.println("element "+arr[i]+" => "+count);
				i+=(count-1);
			}
			
		}

	}

}
