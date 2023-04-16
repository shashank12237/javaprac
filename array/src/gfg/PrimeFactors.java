package gfg;
import java.util.*;
public class PrimeFactors {
public static void primeFactor(int num,int num2)
{
	Set<Integer>set=new HashSet<Integer>();
	Set<Integer>sets=new HashSet<Integer>();
	for(int i=2;i<num;i++)
	{
		while(num%i==0) {
			set.add(i);
			num=num/i;
		}
			
	}
	for(int i=2;i<num2;i++)
	{
		while(num2%i==0) {
			sets.add(i);
			num2=num2/i;
		}
			
	}
	for(Integer e:set)
	{
		System.out.print(" "+e);
	}
	System.out.println();
	for(Integer e:sets)
	{
		System.out.print(" "+e);
	}
	set.retainAll(sets);
	System.out.println(set);
	int mul=1;
	for(Integer e:set)
	{
		mul=mul*e;
	}
	System.out.println(mul);
}
	public static void main(String[] args) {
		int num=356;
		int num2=356;
		primeFactor(num,num2);

	}

}
