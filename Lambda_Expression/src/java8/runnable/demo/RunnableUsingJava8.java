package java8.runnable.demo;

public class RunnableUsingJava8 {

	public static void main(String[] args) {
		
		Runnable r = () -> {
			System.out.println("Inside runnable using lambda expression..");
		};
		Thread t = new Thread(r);
		t.start();
		
		Runnable r1 = () -> System.out.println("Inside run method using java8");
		Thread t1 = new Thread(r1);
		t1.start();
		
		Thread t2 = new Thread(() -> System.out.println("Inside run method.."));
		t2.start();
		
	}

}
