package producer_consumer;

public class Consumer extends Thread {

	company c;
	int i=1;
	Consumer(company c){
		this.c=c;
	}
	public void run() {
		while(true) {
			
			try {
				this.c.consume();
				Thread.sleep(1000);
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
