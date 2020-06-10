package java8.numericStream.streamsAPI;

import java.util.stream.IntStream;

public class NumericIntStreamExample {

	public static void main(String[] args) {
		
		IntStream i1 = IntStream.range(1, 50);
		System.out.println("Range method ....");
		System.out.println("Count :- " + i1.count());
		IntStream.range(1,50).forEach(i -> System.out.print(i + " , "));
		
		IntStream i2 = IntStream.rangeClosed(1, 50);
		System.out.println("Range Closed method...");
		System.out.println("Count :- " + i2.count());
		IntStream.rangeClosed(1,50).forEach(i -> System.out.print(i + " , "));
	}

}
