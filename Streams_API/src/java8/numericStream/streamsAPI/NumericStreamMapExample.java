package java8.numericStream.streamsAPI;

import java.util.List;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.toList;

public class NumericStreamMapExample {
	
	public static List<Integer> mapToObj(){
		return IntStream.rangeClosed(1, 5).
					mapToObj((i) -> {
						return new Integer(i);		
					}).
					collect(toList());
	}
	
	public static long mapToLong(){
		return IntStream.rangeClosed(1, 5).  //IntStream
				mapToLong((i)->i).			 // IntStream to LongStream
				sum();
	}
	
	public static double mapToDouble(){
		return IntStream.rangeClosed(1, 5).  //IntStream
				mapToDouble((i)->i).			 // IntStream to LongStream
				sum();
	}
	
	public static void main(String[] args) {
		System.out.println("Map to Object :- " + mapToObj());
		System.out.println("Map to Long :- " + mapToLong());
		System.out.println("Map to Double :- " + mapToDouble());
	}

}
