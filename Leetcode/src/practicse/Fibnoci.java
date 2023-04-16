package practicse;
import java.util.*;
public class Fibnoci {
public static int fib(int N)
{
	if(N<=1)
		 return N;
	else
		return fib(N-1)+fib(N-2);
}
	public static void main(String[] args) {
		// 0 1 1 2 3.............N
		int a=0;
		int b=1;
		int c;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the nbr");
		int N=sc.nextInt();
		for(int i=1;i<N;i++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
			
		}//TimeComplexity==>o(N)
		System.out.println();
		for(int i=0;i<N;i++)
		{
			System.out.print(fib(i)+" ");
		}//TimeComplexity==>o(2^N)

	}

}
