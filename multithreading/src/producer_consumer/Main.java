package producer_consumer;

public class Main {

	public static void main(String[] args) {
		company comp=new company();
		Product p=new Product(comp);
		Consumer c=new Consumer(comp);
		p.start();
		c.start();
	}

}
