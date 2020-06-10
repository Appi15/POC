package java8.terminalOperations.streamsAPI;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import java8.basic.streamsAPI.Student;
import java8.basic.streamsAPI.StudentDataBase;

public class StreamsCombineExample {
	
	public static void calculateTopGPA(){
		Map<Integer,Optional<Student>> s =  StudentDataBase.getAllStudents().stream().
			collect(Collectors.groupingBy(Student::getGradeLevel, 
					Collectors.maxBy(Comparator.comparing(Student :: getGpa))));
		System.out.println(s);
	}
	
	public static void calculateTopGPA1(){
		Map<Integer,Student> s =  StudentDataBase.getAllStudents().stream().
			collect(Collectors.groupingBy(Student::getGradeLevel,
					Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student :: getGpa)), 
							Optional::get)));
					
		System.out.println(s);
	}
	
	public static void calculateLeastGPA1(){
		Map<Integer,Student> s =  StudentDataBase.getAllStudents().stream().
			collect(Collectors.groupingBy(Student::getGradeLevel,
					Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Student :: getGpa)), 
							Optional::get)));
					
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		
		calculateTopGPA();
		calculateTopGPA1();
		calculateLeastGPA1();
	}

}
