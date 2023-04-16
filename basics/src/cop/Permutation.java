package cop;

public class Permutation {
public static int permutation(int n) {
	
	if(n<=1)
	{
		return 1;
	}
	else 
		return n*permutation(n-1);
}

//way2
public  static long fact(long n)
{
	if(n<=1)
		return 1;
	else
		return n*(n-1);
}
public static long npr(long n ,long r) {
	return fact(n)/fact(n-r);
}


	public static void main(String[] args) {
	
int num=6;
int r=4;
int value=0;
int value2=0;
int sub=num-r;
value=permutation(num);
System.out.println("value "+value);
value2=permutation(sub);
System.out.println("value2 "+value2);
int res=value/value2;
System.out.println(res);
//way2
long num1 =6;
long r1=6;
System.out.println(npr(num1,r1));
	}

}
