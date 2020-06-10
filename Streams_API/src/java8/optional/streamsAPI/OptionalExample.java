package java8.optional.streamsAPI;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Supplier;

import java8.basic.streamsAPI.Student;

public class OptionalExample {
	
	public static Supplier<Student> stud = () -> {
		return new Student("Apeksha",2,3.6, "female",Arrays.asList("reading", "music","volleyball"),10);
	};
	
	public static String getStudentName(){
		Student s = stud.get();
		if(s != null){
			return s.getName();
		}
		return null;
	}
	
	public static Optional<String> getStudentNameOptional(){
		//Optional<Student> studOpt = Optional.ofNullable(stud.get());
		Optional<Student> studOpt = Optional.ofNullable(null);  //Optional.empty()
		if(studOpt.isPresent()){
			return studOpt.map(Student :: getName);  //Optional<String>
		}
		return Optional.empty();  //Represents an Optional object with no value
	}
	
	public static void main(String[] args) {
		
		String name = getStudentName();
		if(name != null){
			System.out.println("Length of the student name is :- " + name.length());
		}
		else{
			System.out.println("Student name is empty");
		}
		
		Optional<String> stringOpt = getStudentNameOptional();
		if(stringOpt.isPresent()){
			System.out.println("Length in the optional method :- " + stringOpt.get().length());
		}
		else{
			System.out.println("Name not found");
		}
	}

}
