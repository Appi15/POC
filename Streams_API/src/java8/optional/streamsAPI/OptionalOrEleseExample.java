package java8.optional.streamsAPI;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Supplier;

import java8.basic.streamsAPI.Student;

public class OptionalOrEleseExample {
	
	public static Supplier<Student> stud = () -> {
		return new Student("Apeksha",2,3.6, "female",Arrays.asList("reading", "music","volleyball"),10);
	};
	
	public static String optionalOrElse(){
		//Optional<Student> s = Optional.ofNullable(stud.get());
		Optional<Student> s = Optional.ofNullable(null);
		return s.map(Student::getName).orElse("Default");
	}
	
	public static String optionalOrElseGet(){
		Optional<Student> s = Optional.ofNullable(stud.get());
		//Optional<Student> s = Optional.ofNullable(null);
		return s.map(Student::getName).orElseGet(() -> "Default");
	}
	
	public static String optionalOrElseThrow(){
		//Optional<Student> s = Optional.ofNullable(stud.get());
		Optional<Student> s = Optional.ofNullable(null);
		return s.map(Student::getName).orElseThrow(() -> new RuntimeException("No data available"));
	}
	
	public static void main(String[] args) {
		
		System.out.println("Optional orElse() :- " + optionalOrElse());
		System.out.println("Optional orElseGet() :- " + optionalOrElseGet());
		System.out.println("Optional orElseThrow() :- " + optionalOrElseThrow());
	}

}
