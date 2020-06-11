package java8.function.functionalInterface;

import java.util.function.Function;

public class FunctionDemo {
	
	static Function<String,String> f1 = (name) -> name.toUpperCase();
	static Function<String,String> f2 = (name) -> name.concat("default");
	
	public static void main(String[] args) {
		
		System.out.println("Result is : - " + f1.apply("java8"));
		System.out.println("Result of andThen is : - " + f1.andThen(f2).apply("java8"));
		System.out.println("Result of compose is :- " + f1.compose(f2).apply("java8"));
	}

}
