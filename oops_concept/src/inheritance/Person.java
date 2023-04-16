package inheritance;

public class Person {
private String fname;
private String lname;
private String adr; 
public Person(String fname,String lname,String adr)
{
	this.fname=fname;
	this.lname=lname;
	this.adr=adr;
	
}
public void address()
{
	System.out.println(adr);
}
@Override
public String toString() {
	return "Person [fname=" + fname + ", lname=" + lname + "]";
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
}
