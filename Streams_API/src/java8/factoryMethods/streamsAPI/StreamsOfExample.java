package java8.factoryMethods.streamsAPI;

import java.util.stream.Stream;

public class StreamsOfExample {

	public static void main(String[] args) {
		
		Stream<String> s = Stream.of("Adam","Eve","John");
		s.forEach(System.out::println);
	}

}
