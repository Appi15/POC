package java8.terminalOperations.streamsAPI;

import java.util.stream.Collectors;

import java8.basic.streamsAPI.Student;
import java8.basic.streamsAPI.StudentDataBase;

public class StreamsSumAveargeExample {
	
	public static int sum(){
		return StudentDataBase.getAllStudents().stream().
				collect(Collectors.summingInt(Student :: getNoteBooks));
	}
	
	public static double average(){
		return StudentDataBase.getAllStudents().stream().
				collect(Collectors.averagingInt(Student :: getNoteBooks));
	}
	
	public static void main(String[] args) {
		
		System.out.println("Total number of note books :- " + sum());
		System.out.println("Average number of note books :- " + average());
		
	}

}
