package java8.numericStream.streamsAPI;

import java.util.stream.LongStream;

public class NumericLongStreamExample {

	public static void main(String[] args) {
		
		LongStream i1 = LongStream.range(1, 50);
		System.out.println("Range method ....");
		System.out.println("Count :- " + i1.count());
		LongStream.range(1,50).forEach(i -> System.out.print(i + " , "));
		
		LongStream i2 = LongStream.rangeClosed(1, 50);
		System.out.println();
		System.out.println("Range Closed method...");
		System.out.println("Count :- " + i2.count());
		LongStream.rangeClosed(1,50).forEach(i -> System.out.print(i + " , "));

	}

}
