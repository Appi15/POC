package java8.interfaces.basic;

import java.util.List;

public class MultiplierImpl implements Multiplier {

	@Override
	public int multiply(List<Integer> intList) {
		return intList.stream().reduce(1 , (x,y) -> x*y);
	}
	
	public int size(List<Integer> intList){
		System.out.println("Inside MultiplierImpl");
		return intList.size();
	}

}
