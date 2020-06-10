package java8.optional.streamsAPI;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Supplier;

import java8.basic.streamsAPI.Student;

public class OptionalMap_FlatMap_FilterExample {
	
	public static Supplier<Student> stud = () -> {
		Bike bike  = new Bike();
    	bike.setName("Abc");
    	bike.setModel("123");
		Student s = new Student("Apeksha",2,3.9, "female",Arrays.asList("reading", "music","volleyball"),10);
		s.setBike(Optional.ofNullable(bike));
		return s;
	};
	
	public static void optionalFilter(){
		Optional<Student> studOpt = Optional.ofNullable(stud.get());  //Optional<Student>
		studOpt.filter(student -> student.getGpa()>=3.5).
			ifPresent(student -> System.out.println(student));
	}
	
	public static void optionalMap(){
		Optional<Student> studOpt = Optional.ofNullable(stud.get());  //Optional<Student>
		if(studOpt.isPresent()){
			studOpt.filter(student -> student.getGpa() >=3.5).
				map(Student::getName);
			System.out.println(studOpt.get());
		}
	}
	
	public static void OptionalFlatMap(){
		Optional<Student> studOpt = Optional.ofNullable(stud.get());  //Optional<Student>
		Optional<String> name = studOpt.filter(s -> s.getGpa()>=3.9). //Optional<Student <Optional<Bike>>>
				flatMap(Student :: getBike).						  //Optional<Bike>
				map(Bike :: getName);
		//System.out.println(name);
		name.ifPresent(s -> System.out.println("Name :- " + s));
	}
	
	public static void main(String[] args) {
		
		optionalFilter();
		optionalMap();
		OptionalFlatMap();
	}

}
