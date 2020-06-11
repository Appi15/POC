package java8.local_instance.variable.demo;

import java.util.function.Consumer;

public class LambdaVariableDemo {

	public static void main(String[] args) {
		
		int i = 0;
		
		/*Consumer<Integer> c1 = (i)->{
			System.out.println(i);
		};*/
		
		Consumer<Integer> c1 = (i1)->{
			System.out.println(i1);
		};
		
		c1.accept(3);
	}

}
