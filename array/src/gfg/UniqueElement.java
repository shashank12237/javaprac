package gfg;

public class UniqueElement {
public static void unique(int arr[])
{
	int temp=0;
	
	for(int i=0;i<arr.length;i++)
	{
		int count=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				count++;
				
			}		
		}
		if(count==1)
			temp=arr[i];	
//		else
//			System.out.println("no unique");
	}
	
	System.out.println(temp);
	
}
	public static void main(String[] args) {
		int arr[]= {1,1,2,2,3,3};
unique(arr);
	}

}