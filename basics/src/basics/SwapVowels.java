package basics;

public class SwapVowels {
public static boolean isVowel(char ch)
{
	if(ch=='a'||ch=='a'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||
			ch=='u'||ch=='U')
	{
		return true;
	}
	else 
		return false;
}
public static String reverseVowels(String str)
{
	int n=str.length();
	int start=0;
	int end=n-1;
	char ch[]=str.toCharArray();
	while(start<end)
	{
		if(!isVowel(ch[start])) {
			start++;
		}
		else if(!isVowel(ch[end]))
		{
			end--;
		}
		else {
			char temp=ch[start];
			ch[start]=ch[end];
			ch[end]=temp;
			start++;
			end--;
		}
	}
	return String.valueOf(ch);
}
	public static void main(String[] args) {
		
String str="helloimshashankkumarsinghaeioughioaio";
System.out.println(reverseVowels(str));
	}

}
