package java8.local_instance.variable.demo;

import java.util.function.Consumer;

public class LambdaVariableDemo1 {
	
	static int instance_Val = 0;
	public static void main(String[] args) {
		
		int value = 4;
		
		Consumer<Integer> c1 = (i) -> {
			//value++;
			instance_Val++;
			System.out.println(i);
		};
			
		c1.accept(8);
	}

}
