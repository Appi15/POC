package java8.numericStream.streamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {
	
	public static int sumOfNumbers(List<Integer> l){
		return l.stream().
				reduce(0, (x,y)->x+y); //unboxing to convert the Integer to int
	}
	
	public static int sumOfNumbersWithIntStream(){
		return IntStream.rangeClosed(1, 6).sum();
	}
	
	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6);
		System.out.println("Sum of numbers is :- " + sumOfNumbers(intList));
		System.out.println("Sum of numbers using int stream is :- " + sumOfNumbersWithIntStream());
	}

}
