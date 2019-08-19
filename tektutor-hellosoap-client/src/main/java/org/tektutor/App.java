package org.tektutor;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HelloService service = new HelloService();
		
		Hello hello = service.getHello();
		
		System.out.println(hello.sayHello());
	}

}
