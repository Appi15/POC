package java8.numericStream.streamsAPI;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {

	public static void main(String[] args) {
		
		int sum = IntStream.rangeClosed(1, 50).sum();
		System.out.println("Sum is :- " + sum);
		
		OptionalInt max = IntStream.rangeClosed(1, 50).max();
		if(max.isPresent()){
			System.out.println("Max value is :- " + max.getAsInt());
		}
		else{
			System.out.println("Stream is empty");
		}
		
		OptionalLong min = LongStream.rangeClosed(100, 200).min();
		if(min.isPresent()){
			System.out.println("Min value is :- " + min.getAsLong());
		}
		else{
			System.out.println("Stream is empty.");
		}
		
		OptionalDouble avg = IntStream.rangeClosed(1, 50).average();
		if(avg.isPresent()){
			System.out.println("Average is :- " + avg.getAsDouble());
		}
		else{
			System.out.println("Stream is empty.");
		}
	}

}
