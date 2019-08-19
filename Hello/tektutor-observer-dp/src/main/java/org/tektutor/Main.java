package org.tektutor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PaperWala paperwala = new PaperWala("Pune ltd");
		paperwala.addSubscriber(new Subscriber("Ramesh"));
		
		paperwala.addSubscriber(new Subscriber("Rishi"));
		
		paperwala.notifyAllSubscribers("Delivered TOI");
		
		

	}

}
