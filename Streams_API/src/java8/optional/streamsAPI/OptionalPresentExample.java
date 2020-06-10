package java8.optional.streamsAPI;

import java.util.Optional;

public class OptionalPresentExample {
	
	public static void main(String[] args) {
		
		Optional<String> s1 = Optional.ofNullable("Hello Optional");
		Optional<String> s2 = Optional.ofNullable(null);
		System.out.println(s1.isPresent());
		System.out.println(s2.isPresent());
		
		if(s2.isPresent()){
			System.out.println(s2.get());
		}
		
		s1.ifPresent(s -> System.out.println(s));
	}

}
