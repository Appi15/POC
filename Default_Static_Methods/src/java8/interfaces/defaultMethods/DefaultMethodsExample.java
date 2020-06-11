package java8.interfaces.defaultMethods;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodsExample {

	public static void main(String[] args) {
		
		List<String> stringList = Arrays.asList("Apesha","Sam","John","Rohan");
		
		//Prior to java8
		Collections.sort(stringList);
		System.out.println("Sorted list using Collections :- " + stringList);
		
		//Java8
		stringList.sort(Comparator.naturalOrder());
		System.out.println("Sorted list using list :- " + stringList);
		
		stringList.sort(Comparator.reverseOrder());
		System.out.println("Sorted list reversed using list :- " + stringList);
	}

}
