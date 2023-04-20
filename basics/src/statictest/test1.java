package statictest;

public class test1 {
private static String name;
private int rollno;
static {
	name="sks";
	//rollno=100;cant use non static member inside a static block
}
public static void num() {
	//rollno=100;cant use a non static instance var inside a static m()
	System.out.println(name);
	//num1();//also inside a static m() we can't call a non-static m()
	
	
	//public static int class=10;//==> can't declare a static keyword inside 
	//any m() either its a static or non static
}
public  void num1() {
	rollno=100;//inside a non static m() we xcan use a static var
	System.out.println(rollno);
	System.out.println(name);
	num();//also inside a non static m() we can call a static m()
	
	//public static int class=10;//==> can't declare a static keyword inside 
	//any m() either its a static or non static
	
	
	//cant declare a m() inside a m()
//	public void  name1() {
//		System.out.println();
//	}
}
}
