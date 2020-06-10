package java8.parallelProcessing.StreamsAPI;

import java.util.stream.IntStream;

public class SumClient {

	public static void main(String[] args) {
		
		Sum s = new Sum();
		IntStream.rangeClosed(1, 1000).
			parallel().forEach(s::performSum);
		System.out.println(s.getTotal());
	}

}
