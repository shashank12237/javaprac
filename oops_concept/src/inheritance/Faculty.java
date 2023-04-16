package inheritance;

public class Faculty extends Person{

	String sub;
	public Faculty(String fname, String lname,String adr,String sub) {
		super(fname, lname,adr);
		this.sub=sub;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	@Override
	public String toString() {
		return "Faculty [sub=" + sub + ", toString()=" + super.toString() + "]";
	}
public String teach()
{
	return getFname()+" "+getLname()+"teaches "+sub;
}
}
