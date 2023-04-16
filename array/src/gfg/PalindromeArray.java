package gfg;

public class PalindromeArray {

public static int palinarray(int arr[],int n)
{int count=0;
int count2=0;
	for(int i=0;i<n;i++)
	{
		int temp,num,rem,sum;
		temp=arr[i];
		num=arr[i];
		
		sum=0;
		
		while(num>0)
		{
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		if(sum==temp)
		{
			count++;
		}
		else
			count2++;
	}
	if(count2>0)
	return 0;
	else 
		return 1;
}
	public static void main(String[] args) {
		int arr[]= {111,121,321};
		int arr2[]= {121,131,555,20};
		int arr3[]= {141,161,333};
		int n=arr.length;
		int n2=arr2.length;
		int n3=arr3.length;
	
		System.out.println(palinarray(arr3,n3));


	}

	

}
