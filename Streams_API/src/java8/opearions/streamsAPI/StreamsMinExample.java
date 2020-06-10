package java8.opearions.streamsAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinExample {
	
	public static int findMinValue(List<Integer> li){
		return li.stream(). //Stream<Integer>
			reduce(0,(x,y)-> x<y ? x:y);
	}
	
	public static Optional<Integer> findMinValueOptional(List<Integer> li){
		return li.stream(). //Stream<Integer>
			reduce((x,y)-> x<y ? x:y);
	}
	
	public static void main(String[] args) {
		
		List<Integer> integerList = Arrays.asList(6,7,8,9,10);
		List<Integer> integerLi = new ArrayList<Integer>();
		
		int minValue = findMinValue(integerList);
		System.out.println("Min value is :- " + minValue);
		
		int minValue1 = findMinValue(integerLi);
		System.out.println("Min value1 is :- " + minValue1);
		
		Optional<Integer> optionalMin = findMinValueOptional(integerList);
		if(optionalMin.isPresent()){
			System.out.println(optionalMin.get());
		}
		else{
			System.out.println("No min value is present");
		}
	}

}
