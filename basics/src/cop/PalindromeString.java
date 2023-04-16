package cop;

public class PalindromeString {
	public static void StringCheck(String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(rev.equals(str)) {
			System.out.println(str+" is a palindrome");
		}
		else
			System.out.println(str+" not a palindrome");
	}

	public static void main(String[] args) {
		String str="hello";
		StringCheck(str);

	}

	
}
