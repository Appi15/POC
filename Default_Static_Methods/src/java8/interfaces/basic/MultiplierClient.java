package java8.interfaces.basic;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {

	public static void main(String[] args) {
		
		Multiplier m = new MultiplierImpl();
		
		List<Integer> list = Arrays.asList(1,3,5); 
		
		System.out.println("Result is :- " + m.multiply(list));
		System.out.println("Default method call. Size is :- " + m.size(list));
		System.out.println("Static method call. Is list empty ? :- " + Multiplier.isEmpty(list));
	}

}
