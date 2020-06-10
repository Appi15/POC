package java8.terminalOperations.streamsAPI;

import java.util.stream.Collectors;

import java8.basic.streamsAPI.Student;
import java8.basic.streamsAPI.StudentDataBase;

public class StreamsJoiningExample {
	
	public static String joiningNames1(){
		return StudentDataBase.getAllStudents().stream().
				map(Student :: getName).
				collect(Collectors.joining());
	}
	
	public static String joiningNames2(){
		return StudentDataBase.getAllStudents().stream().
				map(Student :: getName).
				collect(Collectors.joining("-"));
	}
	
	public static String joiningNames3(){
		return StudentDataBase.getAllStudents().stream().
				map(Student :: getName).
				collect(Collectors.joining("-","(",")"));
	}
	
	public static void main(String[] args) {
		
		System.out.println("Joining 1 :- " + joiningNames1());
		System.out.println("Joining 2 :- " + joiningNames2());
		System.out.println("Joining 3 :- " + joiningNames3());
	}

}
