package operations;
import java.util.Arrays;
import java.util.stream.*;
public class ReturnIndex {

	public static void main(String[] args) {
		int temp1=0,temp2=0;
		int key=1;
		int arr[]= {1,2,3,1,4,5,99,1};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key)
			{
				temp1=i;
				break;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key)
			{
				temp2=i;
				
			}
		}
		int arr1[]= {temp1,temp2};
		System.out.println(Arrays.toString(arr1));
		//for second loop try reverse traversal 
	}
	

}
