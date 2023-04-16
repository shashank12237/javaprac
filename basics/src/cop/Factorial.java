package cop;

public class Factorial {

	public static int factorial(int a)
	{
		int fact=1;
		for(int i=a;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
		
	}
	public static int factorial_recursion(int num) {
		if (num==0)
		{
			return 1;
		}
		
		return num*factorial_recursion(num-1);
		
	}
	
	public static void main(String[] args) {
		
		int x=6;
		System.out.println(factorial(x));
		System.out.println("via recursion "+factorial_recursion(x));
		
	}

}
