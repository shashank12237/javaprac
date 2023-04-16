package operations;

import java.util.Arrays;

public class binaryString {

	public static boolean binary(String str)
	{
		char[] c=str.toCharArray();
//		for(int i=0;i<c.length;i++)
//		{
//			System.out.println(c);
//		}
		boolean flag=true;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='1' || c[i]=='0')
			{
				flag= true;
			}
			else {
				flag=false;
				break;
			}
		}
//		if(flag==true)
//			return true;
//		else
//			return false;
//		or
		return flag;
	}
	public static void main(String[] args) {
		String str= "110110110";
		String str1="11011107110";
//		binary(str);
		System.out.println(binary(str));
		

	}

}
