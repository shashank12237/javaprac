package cop;

public class CountNumbOfDifgits {
	
public static int count_num_of_digits(int num) {
		int count=0;
		while(num !=0) {
			num=num/10;
			count++;
		}
		return count;
		
		
	}

	public static void main(String[] args) {
		int num=122222;
		System.out.println(count_num_of_digits(num));

	}

	
}
