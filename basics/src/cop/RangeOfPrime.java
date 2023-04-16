package cop;
import java.util.*;
public class RangeOfPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number uopto which u want prime nbrs");
		int n=sc.nextInt();
		
		for(int i=2;i<n;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i+" ");
			}
			
		}
	}

}
