package java8.opearions.streamsAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReducerExample {
	
	public static int performMultiplication(List<Integer> integerList){
		return integerList.stream(). //Stream<Integer>
				reduce(1, (a,b) ->a*b); // a=1 , b=1(from Stream) -> result = 1
										// a=1 (result) , b=3 (from stream) -> result=3
										// a=3 (result) , b=5 (from stream) -> result=15 and so on...
	}
	
	public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList){
		return integerList.stream(). //Stream<Integer>
				reduce((a,b) ->a*b); // a=1 , b=1(from Stream) -> result = 1
										// a=1 (result) , b=3 (from stream) -> result=3
										// a=3 (result) , b=5 (from stream) -> result=15 and so on...
	}
	
	public static void main(String[] args) {
		
		List<Integer> integers = Arrays.asList(1,3,5,7);
		List<Integer> ints = new ArrayList<Integer>();
		System.out.println(performMultiplication(integers));
		
		Optional<Integer> result = performMultiplicationWithoutIdentity(integers);
		System.out.println(result.isPresent());
		System.out.println(result.get());
		
		Optional<Integer> result1 = performMultiplicationWithoutIdentity(ints);
		System.out.println(result1.isPresent());
		
		if(result1.isPresent()){
			System.out.println(result1.get());
		}
	}

}
