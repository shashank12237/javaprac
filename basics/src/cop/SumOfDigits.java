package cop;

import java.util.Scanner;

public class SumOfDigits {

	public static int Sum(int num) {
		int temp=num;
		int sum=0;
		int rem;
		while(num!=0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		/*
		 * 123==>1+2+3
		 * 3   2
		 * 3   5
		 * 12  
		 */
		System.out.println("Enter rthe number");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("The sum is "+Sum(num));
	}

}
