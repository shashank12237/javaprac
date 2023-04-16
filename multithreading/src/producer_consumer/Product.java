package producer_consumer;

public class Product extends Thread {

	company c;
	int i=1;
	Product(company c){
		this.c=c;
	}
	public void run() {
		while(true) {
			try {
				this.c.produce(i);
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			i++;
		}//while ends 
	}
	
	
}
