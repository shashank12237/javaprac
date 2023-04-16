package operations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountLongest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str= { "Geek", "Geeks", "Geeksfor",
				  "GeeksforGeek", "GeeksforGeeks","abcdefghijklmnop" ,"ab"};
		int count=0;
		int element=str[0].length();
		for(int i=1;i<str.length;i++)
		{
			if(str[i].length()>element)
			{
				element=str[i].length();
				count=i;
			}
		}
		System.out.println(str[count]);
		
		
//		List<Integer>list=new ArrayList<Integer>();
//		for(int i=0;i<str.length;i++)
//		{
//			list.add(str[i].length());
//		}
//		Collections.sort(list);
//	System.out.println(list.get(list.size()-1));
//		int j=0;
//		j=list.size()-1;
//		System.out.println(str[j]);
	}

}
