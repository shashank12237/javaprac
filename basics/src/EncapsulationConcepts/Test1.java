package EncapsulationConcepts;

public class Test1 {
	/*
	 * Access specifiers on instance variables:
	 * 1 Private(by default)\
	 * 2 Protected
	 * 3 Public
	 */
	
	// by help of making our data private we can acheive enapsulation
	/*
	 * 1 binding of data and m()s that operates on that data
	 *  whithin a sngle unit is called Encapsulation
	 *  It is acheived by making our instance vars/data as private
	 *  
	 *  Main aim is data hiding
	 *  we will provide only interfaces to outer world 
	 *  and hiding the implementations of data from the outer world
	 */
	
 int rollno;//by default private
String name;//by default private


public Test1(String name,int rollno)
{
	this.name=name;
	this.rollno=rollno;
}
private Test1(String name)
{
	this.name=name;
	
}
private void show() {
	System.out.println(name+" "+rollno);
}
public void display(){
	//Test1(name); calling ctor inside a m() not allowed
	
	//calling a private m() inside a public m() is allowed 
	show();
}

//getters and setters
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
