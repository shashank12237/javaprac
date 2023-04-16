package mergetwoArray;

public class Approach1 {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,4};
		int arr2[]= {5,6,7,8};
		int arr3[]= new int[arr1.length+arr2.length];
//		arr3[]=arr1[];
		for(int i=0;i<arr3.length;i++)
		{
			arr3[i]=arr1[i];
		}
		for(int i=arr2.length;i<arr3.length;i++)
		{
			arr3[i]=arr2[i];
		}
		System.out.println("o/p:");
		for(int i=0;i<arr3.length;i++)
		{
			System.out.print(" "+arr3[i]);
		}
	}

}
