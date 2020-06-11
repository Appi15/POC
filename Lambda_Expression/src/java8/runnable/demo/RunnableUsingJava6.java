package java8.runnable.demo;

public class RunnableUsingJava6 {

	public static void main(String[] args) {
		
		Runnable r = new Runnable(){
			public void run(){
				System.out.println("Inside run method...");
			}
		};
		
		Thread t  = new Thread(r);
		t.start();
	}

}
