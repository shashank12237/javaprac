package gfg;

public class Median {
public static void median(int a[]) {
	int n=a.length;
	if(n%2!=0)
	{
		int i=(n+1)/2;
		System.out.println(a[i]);
	}
	else
	{
		int j=n/2;
		int k=(n/2)+1;
		int l=(j+k)/2;
		System.out.println(a[l]);
	}
}
	public static void main(String[] args) {
		int arr[]= {1,1,2,3,4,5,5,66,9};
		int brr[]= {1,1,2,3,4,5,5,6,9,10};
		System.out.println("for odd ");
		median(arr);
		System.out.println("for even");
		median(brr);
	}

}
