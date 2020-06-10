package java8.numericStream.streamsAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxingUnboxingExample {
	
	public static List<Integer> boxing(){
		return IntStream.rangeClosed(1, 10).  //Stream of int
			boxed().						  //Stream of Integer
			collect(Collectors.toList());
	}
	
	public static int unboxing(List<Integer> intList){
		return intList.stream().				// Wrapper Integer values
				mapToInt(Integer :: intValue).  // IntStream (int value of wrapper class)
				sum();
	}
	
	public static void main(String[] args) {
		System.out.println("Boxing :- " + boxing());
		
		List<Integer> l = boxing();
		System.out.println("Unboxing :- " + unboxing(l));
	}

}
