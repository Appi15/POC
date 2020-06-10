package java8.parallelProcessing.StreamsAPI;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {
	
	public static long checkPerformanceResult(Supplier<Integer> supp ,int n){
		long startTime = System.currentTimeMillis();
		for(int i=0;i<n;i++){
			supp.get();
		}
		long endTime = System.currentTimeMillis();
		return endTime-startTime;
	}
	
	public static int sumSequentialStream(){
		return IntStream.rangeClosed(1, 1000).sum();
	}
	
	public static int sumParallelStream(){
		return IntStream.rangeClosed(1, 1000).parallel().sum();
	}
	
	public static void main(String[] args) {
		
		System.out.println(Runtime.getRuntime().availableProcessors());
		//System.out.println("Sequential Stream :- "  + sumSequentialStream());
		//System.out.println("Parallel Stream :- " + sumParallelStream());
		
		System.out.println("Sequential Stream :- "  + 
				checkPerformanceResult(ParallelStreamExample :: sumSequentialStream,20));
		
		System.out.println("Parallel Stream :- " + 
				checkPerformanceResult(ParallelStreamExample :: sumParallelStream, 20));
	}

}
