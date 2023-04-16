package starpatterns;

import java.util.Scanner;

public class HollowRect {

	public static void main(String[] args) {
		System.out.println("enter the value of rows i.e n ");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter the number of columns i.e m ");
		int m=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i==1||j==1||i==n||j==m)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
