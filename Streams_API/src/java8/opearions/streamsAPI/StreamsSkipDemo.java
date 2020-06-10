package java8.opearions.streamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsSkipDemo {
	
	public static Optional<Integer> skip(List<Integer> l){
		return l.stream().  //Stream<Integer> 
				skip(2).   //Stream<Integer> removing first two elements only
				reduce((x,y) -> x+y);
	}
	
	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(6,7,8,9,10);
		Optional<Integer> result = skip(l);
		if(result.isPresent()){
			System.out.println("Result is " + result.get());
		}
		else{
			System.out.println("Result is empty.");
		}

	}

}
