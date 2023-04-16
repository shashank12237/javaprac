package inheritance;

public class Tester {

	public static void main(String[] args) {
		Person p=new Person("Ekya", "Mkl");//new obj of class Person
		p.setLname("chinari");
		System.out.println(p);
		
		Person s=new Student("Eklavya", "Randwa", 69) ;//new obj of class Person
		System.out.println(s);
		//s.info();s==> Person ==> can't refer to subclass method directly
		//to i we have to do downcastng 
		/*
		 * Student std=(Student)s;
		System.out.println(std.info());;
		or we can combine nd write both step as one
		 */
		System.out.println(((Student)s).info());
	}

}
