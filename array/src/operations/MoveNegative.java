package operations;

public class MoveNegative {

	public static void main(String[] args) {
		int arr[]= {-1,-3,4,8,6,-2};
		int temp=0;int min;
		for(int i=0;i<arr.length;i++)
		{
			min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
		
	}

}
