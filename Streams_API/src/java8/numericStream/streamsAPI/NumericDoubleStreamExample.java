package java8.numericStream.streamsAPI;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericDoubleStreamExample {

	public static void main(String[] args) {
		
		IntStream i1 = IntStream.range(1, 50);
		DoubleStream d1 = i1.asDoubleStream();
		System.out.println(d1.count());
		IntStream.range(1, 50).asDoubleStream().forEach(d-> System.out.print(d + " , "));
		System.out.println();
		LongStream i2 = LongStream.range(1, 50);
		DoubleStream d2 = i2.asDoubleStream();
		System.out.println(d2.count());
		LongStream.range(50, 100).asDoubleStream().forEach(d -> System.out.print(d + " , "));
	}

}
