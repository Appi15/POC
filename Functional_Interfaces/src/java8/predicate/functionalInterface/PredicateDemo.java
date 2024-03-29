package java8.predicate.functionalInterface;

import java.util.function.Predicate;

public class PredicateDemo {
	
	static Predicate<Integer> p1 = (i) -> i%2==0;
	static Predicate<Integer> p2 = (i) -> i%5==0;
	
	
	public static void predicateAnd(){
		System.out.println("Predicate AND result is :- " +p1.and(p2).test(9));
		System.out.println("Predicate AND result is :- " +p1.and(p2).test(10));
	}
	
	public static void predicateOr(){
		System.out.println("Predicate OR result is :- " +p1.or(p2).test(8));
		System.out.println("Predicate OR result is :- " +p1.or(p2).test(10));
	}
	
	public static void predicateNegate(){
		System.out.println("Predicate Negate result is :- " +p1.or(p2).negate().test(8));
		System.out.println("Predicate Negate result is :- " +p1.or(p2).negate().test(10));
	}
	
	public static void main(String[] args) {
		
		//System.out.println(p1.test(20));
		//System.out.println(p1.test(57));
		
		predicateAnd();
		predicateOr();
		predicateNegate();
	}

}
