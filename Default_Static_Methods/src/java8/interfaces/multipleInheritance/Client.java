package java8.interfaces.multipleInheritance;

public class Client implements Interface1, Interface2, Interface3 {
	
	public void methodA(){
		System.out.println("Client :- Method A");
	}
	
	public static void main(String[] args) {
		
		Client c = new Client();
		c.methodA();
		c.methodB();
		c.methodC();
		
	}
}
