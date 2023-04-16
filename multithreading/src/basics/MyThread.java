package basics;

public class MyThread extends Thread{

	public void run() {// return type always void
		// using thread class
		for(int i=10;i>=1;i--)
		{
			System.out.println(" our Mythread returns i value "+i);
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		MyThread thr2=new MyThread();
		thr2.start();
		ThreadCreation t3=new ThreadCreation();
		Thread thr3=new Thread(t3);
		thr2.setPriority(MAX_PRIORITY);
		thr3.start();
		System.out.println("Mythread id "+thr2.getId());	
		System.out.println("thread id "+thr3.getId());	
		
	}

}
