package java8.methodReference;

import java.util.function.Function;

public class FunctionDemo {
	
	static Function<String,String> f = (s) ->s.toUpperCase();
	static Function<String,String> f1 = String :: toUpperCase;
	
	public static void main(String[] args) {
		
		System.out.println("Using function interface :- " +f.apply("Java"));
		System.out.println("Using Method reference :- " +f1.apply("java"));
	}

}

