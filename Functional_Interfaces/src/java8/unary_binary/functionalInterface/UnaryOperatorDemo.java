package java8.unary_binary.functionalInterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
	
	static UnaryOperator<String> u = (s) -> s.concat(" Java");
	
	public static void main(String[] args) {
		
		System.out.println(u.apply("Hello"));	
	}

}
