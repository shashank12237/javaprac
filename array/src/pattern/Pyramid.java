package pattern;
import java.util.*;
public class Pyramid {

	public static void main(String[] args) {
		/*
		 *     *
		 *    * *
		 *   * * *
		 *  * * * *  
		 */
		System.out.println("Enter the size of pyramid that is num of rows");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
		for(int k=i;k<n;k++)
			System.out.print(" ");
		for(int j=0;j<(i+1);j++)
	//		System.out.print("* ");
//			System.out.print((i+1)+" ");
		System.out.print((j+1)+" ");
		System.out.println();
	}
		for(int i=0;i<10;i++)
		System.out.print("#");
		System.out.println();
		
		for(int i=0;i<n;i++) {
			for(int k=0;k<i;k++)
				System.out.print(" ");
			for(int j=i;j<n;j++)
				System.out.print("* ");
			System.out.println();
		}
			
		}
	}


