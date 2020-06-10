package java8.parallelProcessing.StreamsAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamBoxedExample {
	
	public static int sequentialSum(List<Integer> l){
		long startTime = System.currentTimeMillis();
		int sum = l.stream().reduce(0,(x,y)->x+y);
		long endTime = System.currentTimeMillis();
		System.out.println("Duration in sequential stream :- " + (endTime-startTime));
		return sum;
	}
	
	public static int parallelSum(List<Integer> l){
		long startTime = System.currentTimeMillis();
		int sum = l.parallelStream().reduce(0,(x,y)->x+y);
		long endTime = System.currentTimeMillis();
		System.out.println("Duration in parallel stream :- " + (endTime-startTime));
		return sum;
	}
	
	public static void main(String[] args) {
		
		List<Integer> intList = IntStream.rangeClosed(1, 1000).boxed().collect(Collectors.toList());
		sequentialSum(intList);
		parallelSum(intList);
	}

}
