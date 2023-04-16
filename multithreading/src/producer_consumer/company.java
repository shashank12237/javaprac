package producer_consumer;

public class company {

	int n;
	boolean f=false;//for inter threadcommuncication //view it in last
	//false ==> producer chance
	//true==>consumer chance
	synchronized public void produce(int n) throws InterruptedException
	{
		//agar f==> false aaya to ye wait karega 
		if(f)//itc view last
		{
			wait();//throws InterruptedException
		}
		// otherwise execute below nd make f=> true and execute
		this.n=n;
		System.out.println(" item produced is: "+n);
		
		f=true;//itc
		notify();//itc
	}
	synchronized public int consume() throws InterruptedException
	{
		//if true is coming then consumer has to wait nd 
		if(!f)//itc
		{
			wait();
		}
		//otherwise execute below nd make f=false alongwith notifying to another thread
		System.out.println(" item consumed is: "+this.n);
		
		f=false;//itc
		notify();//itc
		
		return n;
		
	}
}
