package staticInnerClasses;

public class OuterClass {
private static String name="sks";
private int rollno=100;
private static void marks() {
	//local variables have no access specifier
	 int marks=213;
	System.out.println("marks is "+marks);
}

public static class staticNested{

}
}
