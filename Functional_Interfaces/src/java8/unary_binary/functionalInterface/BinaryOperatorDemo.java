package java8.unary_binary.functionalInterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
	
	static BinaryOperator<Integer> b = (a,b) -> a*b;
	static Comparator<Integer> c = (a,b) -> a.compareTo(b) ;
	
	public static void main(String[] args) {
		
		System.out.println(b.apply(3, 4));

		BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(c);
		System.out.println("Result of maxBy is :- " + maxBy.apply(5, 12));
		
		BinaryOperator<Integer> minBy = BinaryOperator.minBy(c);
		System.out.println("Result of minBy is :- " + minBy.apply(5, 12));
	}

}
