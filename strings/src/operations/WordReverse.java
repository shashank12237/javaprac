package operations;

public class WordReverse {

	public static void main(String[] args) {
		String str="hello my name is sks ";
		String s[]=str.split(" ");
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]+" ");
		}

	}

}
