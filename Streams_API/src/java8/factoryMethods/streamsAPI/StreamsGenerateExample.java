package java8.factoryMethods.streamsAPI;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamsGenerateExample {

	public static void main(String[] args) {
		
		Supplier<Integer> supp = new Random()::nextInt;
		Stream.generate(supp).limit(10).forEach(System.out::println);
	}

}
