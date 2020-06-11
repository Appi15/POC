package java8.comparator.demo;

import java.util.Comparator;

public class ComparatorUsingJava8 {

	public static void main(String[] args) {
		
		Comparator<Integer> comp = (Integer a,Integer b) -> {return a.compareTo(b);};
		
		System.out.println("Result of Comparator using lambda is :- " + comp.compare(10, 20));
		
		Comparator<Integer> comp1 = (a,b) -> {return a.compareTo(b);};
		
		System.out.println("Result of Comparator 1 using lambda is :- " + comp1.compare(100, 20));
	}
	
}
