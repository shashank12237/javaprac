package cop;

public class Palindrome {
public static void check(int n) {
	int temp,div,sum=0;
	temp=n;
	while(temp>0) {
		div=temp%10;
		sum=sum*10+div;//1 21 1
		temp=temp/10;
	}
	if(sum==n)
		System.out.println("its a palindrome ");
	else
		System.out.println("not a palindrome");
}
	public static void main(String[] args) {
		System.out.println("check ");
		int a=100;
		check(a);

	}

}
