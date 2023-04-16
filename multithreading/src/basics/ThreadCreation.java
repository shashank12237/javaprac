package basics;

public class ThreadCreation implements Runnable {
	@Override
	public void run() {
		for(int i=1;i<10;i++)

		{
			System.out.println("the o/p of thread i is "+i);
			try {
				//Thread.sleep(0);
				Thread.sleep(1000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}


	public static void main(String[] args) throws InterruptedException {
		ThreadCreation t1=new ThreadCreation();
		Thread thr=new Thread(t1);
		thr.start();
//		thr.stop(); depricated
//		thr.countStackFrames(); depricated
		System.out.println("thread state "+thr.getState());;
	System.out.println("thread id "+thr.getId());	
	System.out.println("thread class "+thr.getClass());	
	System.out.println("thread name "+thr.getName());	
	System.out.println("thread priority "+thr.getPriority());
	System.out.println("thread context class loader "+thr.getContextClassLoader());
/*
 * o/p 
 * the o/p of thread i is 1
thread state RUNNABLE
thread id 12
thread class class java.lang.Thread
thread name Thread-0
thread priority 5
thread context class loader jdk.internal.loader.ClassLoaders$AppClassLoader@30946e09
the o/p of thread i is 2
the o/p of thread i is 3
the o/p of thread i is 4
the o/p of thread i is 5
the o/p of thread i is 6
the o/p of thread i is 7
the o/p of thread i is 8
the o/p of thread i is 9

 */
		/*
	ThreadCreation t2=new ThreadCreation();
	Thread thr2=new Thread(t2);
	thr2.start();
//	thr.stop(); depricated
//	thr.countStackFrames(); depricated
	System.out.println("thread state "+thr2.getState());;
System.out.println("thread id "+thr2.getId());	
System.out.println("thread class "+thr2.getClass());	
System.out.println("thread name "+thr2.getName());	
System.out.println("thread priority "+thr2.getPriority());
System.out.println("thread context class loader "+thr2.getContextClassLoader());
//	thr.wait();
	*/
	}

	
}
