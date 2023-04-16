package operations;

public class CountOccurence {

	public static void countOccurence(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			int count=1;
			for(int j=i+1;j<arr.length-1-i;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			//System.out.println(arr[i]+" : "+count);
			
			}
			
		}
		
		
	}
	public static void main(String[] args) {
		int arr[]= {10,20,20,8,9,6,6,3,7,8,6};
countOccurence(arr);
	}

}
