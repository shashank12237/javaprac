package operations;

public class Reverse {

	public static void main(String[] args) {
		String str="eureka";
		char[] ch=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
			
		}
		System.out.println();
		//approach2
		for(int i=str.length()-1;i>=0;i--)
		{
			
			System.out.print(str.charAt(i));
		}
		//approach 3
		System.out.println();
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());

	}

}
