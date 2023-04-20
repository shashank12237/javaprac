package statictest2;

public class test2 {
	//At class level 
	public static int num=100;
	
	public static void main(String[] args) {//at m() level
		//public static int num=100;//not allowed cz we can't declared any static
		//m() or instance variable inside a method either its a static or a nn static
		//cz static is asically a type of class it is always declared at class level
		//not at m() level
		
		//any variable declared inside a m() can be called local variable
		//it's scope is limited at this m() only not at class or any other m()
		
		
	//can't declare any m() inside another m()
//		public void name() {
//			System.out.println();
//		}
	}

}
