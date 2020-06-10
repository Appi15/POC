package java8.optional.streamsAPI;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {
	
	public static Optional<String> ofNullable(){
		Optional<String> s = Optional.ofNullable(null);
		return s;
	}
	
	public static Optional<String> of(){
		Optional<String> s = Optional.of("Hello");
		return s;
	}
	
	public static Optional<String> empty(){
		return Optional.empty();
	}
	
	public static void main(String[] args) {
		
		System.out.println("Nullable method :- " +ofNullable().isPresent());
		System.out.println("Of method" + of());
		System.out.println("Empty method :- " + empty());
	}

}
