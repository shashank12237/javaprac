import java.util.Arrays;

public class SelectionSort {
//in this the min is settle at left most first and so on
	

public static void selectionSorting(int[] arr) {
		
	int temp=0;
	int min;
	for(int i=0;i<arr.length;i++)
	{
		min=i;//every time i will be min
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[j]<arr[min])
			{
				min=j;
			}
		}
		temp=arr[i];
		arr[i]=arr[min];
		arr[min]=temp;
	}
	
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	
}
	
	public static void sortedString(String srr[]) {
		//by using comparesto() we will perform this 
		
		int min;
		String temp="";
		for(int i=0;i<srr.length;i++)
		{
			min=i;
			for(int j=i+1;j<srr.length;j++) {
				if(srr[j].compareTo(srr[min])<0)
				{
					min=j;
				}
			}
			temp=srr[i];
			srr[i]=srr[min];
			srr[min]=temp;
		}
		System.out.println();
		for(int i=0;i<srr.length;i++)
		{
			System.out.print(srr[i]+" ");
		}
	
	}
	
	
	public static void main(String[] args) {
		int arr[]= {38,52,9,18,6,2,62,13};
		SelectionSort.selectionSorting(arr);
		String srr[]= {"ekya","jordi","abhinav","yash","sks","yadur"};
		sortedString(srr);
}

}
