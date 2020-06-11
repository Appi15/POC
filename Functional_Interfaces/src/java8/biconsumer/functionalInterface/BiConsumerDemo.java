package java8.biconsumer.functionalInterface;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

	public static void main(String[] args) {
		
		BiConsumer<String,String> biConsumer = (a,b) -> {
			System.out.println("a :- " + a + "   " + "b :- " + b);
		};
		biConsumer.accept("Java7", "Java8");
		
		BiConsumer<Integer,Integer> multiply = (a,b) -> {
			System.out.println("Multiplication of " + a + " and " + b + " is " + (a*b));
		};
		//multiply.accept(10, 20);
		
		BiConsumer<Integer,Integer> divsion = (a,b) -> {
			System.out.println("Division of " + a + " and " + b + " is " + (a/b));
		};
		
		multiply.andThen(divsion).accept(200, 10);
	}

}
