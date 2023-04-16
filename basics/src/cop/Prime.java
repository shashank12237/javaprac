package cop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prime {
public static void prime(int a) {
	boolean flag=false;

	if(a==0||a==1)
		System.out.println("invalid cases");
	else {
		for(int i=2;i<=a/2;i++) {
			if(a%i==0) {
				System.out.println("not a prime ");
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("its a prime ");
		}
		
	}//end of else
}//end of m()

public static void range(int a) {
	int j=2;
	int i=1;
	int count;
	for(j=2;j<=a;j++)
	{count=0;
		for(i=1;i<=j;i++) {
			if(j%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.print(j+" ");
		}
	}
	System.out.println();
		
	
}
	public static void main(String[] args) {
	System.out.println("enter the nbr");
	Scanner sc =new Scanner(System.in);
	int n=sc.nextInt();
	prime(n);
	System.out.println("the range f prime nbrs are ");
	range(n);
	}
	/*
	 * Step1- Start
Step 2- Declare an integer : n
Step 3- Prompt the user to enter an integer value/ Hardcode the integer
Step 4- Read the values
Step 5- Using a while loop from 1 to n, check if the 'i' value is divisible by any number from 2 to i.
Step 6- If yes, check the next number
Step 7- If no, store the number as a prime number
Step 8- Display the 'i' value as LCM of the two numbers
Step 9- Stop
	 */

}
