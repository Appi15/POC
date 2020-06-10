package java8.opearions.streamsAPI;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java8.basic.streamsAPI.Student;
import java8.basic.streamsAPI.StudentDataBase;

public class StreamsMapExample {
	
	public static List<String> namesList(){
		return StudentDataBase.getAllStudents().stream(). //Stream<Student>
				//Student as input -> Student Names as output
				map(Student :: getName). // Stream<String>
				collect(toList()); //List<String>
	}
	
	public static List<String> namesListWithUpperCase(){
		return StudentDataBase.getAllStudents().stream(). //Stream<Student>
				//Student as input -> Student Names as output
				map(Student :: getName). // Stream<String>
				map(String :: toUpperCase).
				collect(toList()); //List<String>
	}
	
	public static Set<String> namesSet(){
		return StudentDataBase.getAllStudents().stream(). //Stream<Student>
				//Student as input -> Student Names as output
				map(Student :: getName). // Stream<String>
				collect(toSet()); //List<String>
	}
	
	public static void main(String[] args) {
		
		System.out.println(namesList());
		System.out.println(namesListWithUpperCase());
		System.out.println(namesSet());
	}

}
