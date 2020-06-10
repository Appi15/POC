package java8.opearions.streamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitExample {
	
	public static Optional<Integer> limit(List<Integer> l){
		return l.stream().  //Stream<Integer> 
				limit(2).   //Stream<Integer> with first two elements only
				reduce((x,y) -> x+y);
	}
	
	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(6,7,8,9,10);
		Optional<Integer> result = limit(l);
		if(result.isPresent()){
			System.out.println("Result is " + result.get());
		}
		else{
			System.out.println("Result is empty.");
		}

	}

}
