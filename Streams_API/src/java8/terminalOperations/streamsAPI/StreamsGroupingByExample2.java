package java8.terminalOperations.streamsAPI;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.stream.Collectors;

import java8.basic.streamsAPI.Student;
import java8.basic.streamsAPI.StudentDataBase;

public class StreamsGroupingByExample2 {
	
	public static void groupByWithArg(){
		LinkedHashMap<String, Set<Student>> s = StudentDataBase.getAllStudents().stream().
			collect(Collectors.groupingBy(Student::getName, LinkedHashMap::new,Collectors.toSet()));
		System.out.println(s);
	}

	public static void main(String[] args) {
		
		groupByWithArg();
	}

}
