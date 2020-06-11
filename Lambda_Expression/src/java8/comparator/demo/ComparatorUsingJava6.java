package java8.comparator.demo;

import java.util.Comparator;

public class ComparatorUsingJava6 {
	
	public static void main(String[] args) {
		
		Comparator<Integer> comp = new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2); // 0 :- o1==o2 ; 1 :- o1>o2 ; -1 :- o1<o2		
			}	
		};
		
		System.out.println("Result of Comparator is :- " +comp.compare(10, 20));
	}
}

