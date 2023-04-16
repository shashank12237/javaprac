package cop;
import java.util.*;
public class FibonnaciSeries {

	public static void main(String[] args) {
		int a=1;
		int b=1;
		int c;
		int n;
		System.out.println("enter the term upto which u want ");
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		for(int i =0;i<=n;i++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}

	}

}
