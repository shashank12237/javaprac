package cop;

public class DecimalToBinary {
public static void decimalToBinary(int num) {
		int arr[]=new int[35];
		int i=0;
		while(num>0) {
			arr[i++]=num%2;
			num=num/2;
		}
		
		System.out.println(" the binary representation is ");
		for(int j=i-1;j>=0;j--) {
			
			System.out.print(arr[j]+" ");
		}
		
	}
public static void decimalToOctal(int num) {
	int arr[]=new int[35];
	int i=0;
	while(num>0) {
		arr[i++]=num%8;
		num=num/8;
	}
	
	System.out.println(" the octal representation is ");
	for(int j=i-1;j>=0;j--) {
		
		System.out.print(arr[j]+" ");
	}
	
}

	public static void main(String[] args) {
		int num=8;
		decimalToBinary(num);
		decimalToOctal(num);
	}

	
}
