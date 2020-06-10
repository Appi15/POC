package java8.parallelProcessing.StreamsAPI;

import static java.util.stream.Collectors.toList;

import java.lang.Thread.State;
import java.util.List;

import java8.basic.streamsAPI.Student;
import java8.basic.streamsAPI.StudentDataBase;

public class ParallelStreamExample1 {
	
	public static List<String> sequentialPrintStudentActivities(){
		long startTime = System.currentTimeMillis();
		List<String> studentActivities =  StudentDataBase.getAllStudents().stream(). //Stream<Student>
				map(Student :: getActivities). //Stream<List<String>>
				flatMap(List :: stream). //Stream<String>
				collect(toList());
		long endTime = System.currentTimeMillis();
		System.out.println("Total time in sequential :- " + (endTime - startTime));
		return studentActivities;
	}
	
	public static List<String> parallelPrintStudentActivities(){
		long startTime = System.currentTimeMillis();
		List<String> studentActivities = StudentDataBase.getAllStudents().stream().//Stream<Student>
				parallel().
				map(Student :: getActivities). //Stream<List<String>>
				flatMap(List :: stream). //Stream<String>
				collect(toList());
		long endTime = System.currentTimeMillis();
		System.out.println("Total time in parallel :- " + (endTime - startTime));
		return studentActivities;
	}
	
	public static void main(String[] args) {
		sequentialPrintStudentActivities();
		parallelPrintStudentActivities();
		
	}

}
