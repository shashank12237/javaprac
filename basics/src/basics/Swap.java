package basics;

public class Swap {
	public static void swap_wo_var(int a,int b){//a=10 b=20
		a=a+b;//10+20=30==>a=30
		b=a-b;//30-20=10==>b=10
		a=a-b;//30-10=20==>a=20
		System.out.println("a is "+a+" b is "+b);
	}
	public static void swap(int a,int b) {
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("a is "+a+" b is "+b);
	}
	public static void swap_xor(int a ,int b)
	{
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a is "+a+" b is "+b);
	}
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("a is "+a+" b is "+b);
		swap_wo_var(a,b);
		swap(a,b);
		swap_xor(a, b);
	}

}
