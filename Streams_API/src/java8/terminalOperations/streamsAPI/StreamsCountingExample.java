package java8.terminalOperations.streamsAPI;

import java.util.stream.Collectors;

import java8.basic.streamsAPI.StudentDataBase;

public class StreamsCountingExample {
	
	public static long count(){
		return StudentDataBase.getAllStudents().stream().collect(Collectors.counting());
	}
	
	public static long countFilter(){
		return StudentDataBase.getAllStudents().stream().
				filter(s -> s.getGpa()>=3.9).
				collect(Collectors.counting());
	}
	
	public static void main(String[] args) {
		
		System.out.println("Total number of students :- " + count());
		System.out.println("Total number of students with GPA >= 3.9 :- " + countFilter());
	}

}
