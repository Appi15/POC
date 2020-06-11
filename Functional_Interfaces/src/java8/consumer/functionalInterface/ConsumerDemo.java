package java8.consumer.functionalInterface;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		Consumer<String> c = (s) -> System.out.println(s.toUpperCase());
		c.accept("Hello");
	}

}
