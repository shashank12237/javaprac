package basics;

import java.util.Arrays;

public class Basics_Jvm {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		 Runtime meow = Runtime.getRuntime();
		 long memory1,memory2;
		 System.out.println("total memory is "+meow.totalMemory());
		 System.out.println(" free memory is "+meow.freeMemory());
		 System.out.println(meow.availableProcessors());
		 System.out.println(meow.hashCode());
		 System.out.println(meow.maxMemory());
		 System.out.println("\t*");
		 int arr[]= {10,20,30,40,50};
		
		
		// System.out.println(" free memory is "+meow.freeMemory());
		 meow.gc();
		 System.out.println("free memory "+meow.freeMemory());
	}

}
