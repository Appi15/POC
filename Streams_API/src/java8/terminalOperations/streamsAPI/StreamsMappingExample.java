package java8.terminalOperations.streamsAPI;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import java8.basic.streamsAPI.Student;
import java8.basic.streamsAPI.StudentDataBase;

public class StreamsMappingExample {
	
	public static void main(String[] args) {
	
		List<String> namesList = StudentDataBase.getAllStudents().stream().
									collect(Collectors.mapping(Student :: getName, Collectors.toList()));
		System.out.println("Names List :- " + namesList);
		
		Set<String> namesSet = StudentDataBase.getAllStudents().stream().
				collect(Collectors.mapping(Student :: getName, Collectors.toSet()));
		System.out.println("Names Set :- " + namesSet);
	}

}
