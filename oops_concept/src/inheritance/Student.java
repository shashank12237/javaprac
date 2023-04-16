package inheritance;

public class Student extends Person {

	private int rollno;
	public Student(String fname, String lname,int rollno) {
		super(fname, lname);
		this.rollno=rollno;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Student rollno=" + rollno + " " + super.toString() ;
	}
	public String info()
	{
		return getFname()+" "+getLname()+" rollno is "+rollno;
	}
}
