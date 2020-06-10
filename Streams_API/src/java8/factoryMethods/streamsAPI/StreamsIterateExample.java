package java8.factoryMethods.streamsAPI;

import java.util.stream.Stream;

public class StreamsIterateExample {

	public static void main(String[] args) {
		
		Stream.iterate(1, x->x*2).limit(10).forEach(System.out::println);
	}

}
