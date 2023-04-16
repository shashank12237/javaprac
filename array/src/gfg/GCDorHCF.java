package gfg;
import java.util.*;
public class GCDorHCF {

	public static int gcd(int a,int b)
	{
		int g=0;
		int n=Math.min(a, b);
		for(int i=1;i<=n;i++)
		{
			if(a%i==0&&b%i==0)
			{
				g=i;
			}
		}
		
		return g;
	}
	public static int gcd3(int a,int b)
	{
		if(a==0)
			return b;
		if(b==0)
			return a;
		if(a==b)
			return a;
		if(a>b)
			return gcd3(a-b,b);
		else
			return gcd3(a,b-a);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("a "+a+" b "+b);
		System.out.println("the greatest common fators are "+gcd(a,b));
		System.out.println("the greatest common fators are "+gcd3(a,b));
	}

}
