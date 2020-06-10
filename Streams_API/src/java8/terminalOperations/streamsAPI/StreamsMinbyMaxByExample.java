package java8.terminalOperations.streamsAPI;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import java8.basic.streamsAPI.Student;
import java8.basic.streamsAPI.StudentDataBase;

public class StreamsMinbyMaxByExample {
	
	public static Optional<Student> minByDemo(){
		return StudentDataBase.getAllStudents().stream().
				collect(Collectors.minBy(Comparator.comparing(Student :: getGpa)));
	}
	
	public static Optional<Student> maxByDemo(){
		return StudentDataBase.getAllStudents().stream().
				collect(Collectors.maxBy(Comparator.comparing(Student :: getGpa)));
	}
	
	public static void main(String[] args) {
		
		System.out.println("Student with lowest GPA is :- " + minByDemo());
		System.out.println("Student with highest GPA is :- " + maxByDemo());
	}

}
