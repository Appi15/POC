package java8.interfaces.multipleInheritance;

public class Client14 implements Interface1, Interface4 {
	
	public void methodA(){
		System.out.println("Client14 :- Method A");
	}
	
	public static void main(String[] args) {
		Client14 c = new Client14();
		c.methodA();
	}

}
