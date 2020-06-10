package java8.opearions.streamsAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMaxExample {
	
	public static int findMaxValue(List<Integer> li){
		return li.stream(). //Stream<Integer>
			reduce(0,(x,y)-> x>y ? x:y);
	}
	
	public static Optional<Integer> findMaxValueOptional(List<Integer> li){
		return li.stream(). //Stream<Integer>
			reduce((x,y)-> x>y ? x:y);
	}
	
	public static void main(String[] args) {
		
		List<Integer> integerList = Arrays.asList(6,7,8,9,10);
		List<Integer> integerLi = new ArrayList<Integer>();
		
		int maxValue = findMaxValue(integerList);
		System.out.println("Max value is :- " + maxValue);
		
		int maxValue1 = findMaxValue(integerLi);
		System.out.println("Max value1 is :- " + maxValue1);
		
		Optional<Integer> optionalMax = findMaxValueOptional(integerLi);
		if(optionalMax.isPresent()){
			System.out.println(optionalMax.get());
		}
		else{
			System.out.println("No max value is present");
		}
		

	}

}
