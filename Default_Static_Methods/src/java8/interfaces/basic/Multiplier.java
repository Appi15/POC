package java8.interfaces.basic;

import java.util.List;

public interface Multiplier {
	
	int multiply(List<Integer> intList);
	
	default int size(List<Integer> intList){
		System.out.println("Inside Multiplier");
		return intList.size();
	}
	
	static boolean isEmpty(List<Integer> intList){
		return intList != null && intList.size()>0 ;
	}
}
