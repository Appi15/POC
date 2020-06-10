package java8.opearions.streamsAPI;

import static java.util.stream.Collectors.toList;

import java.util.List;

import java8.basic.streamsAPI.Student;
import java8.basic.streamsAPI.StudentDataBase;

public class StreamDistinct_Count_SortedExample {
	
	public static List<String> printDistinctStudentActivities(){
		return StudentDataBase.getAllStudents().stream(). //Stream<Student>
				map(Student :: getActivities). //Stream<List<String>>
				flatMap(List :: stream). //Stream<String>
				distinct().  //Stream<String> with unique activities
				collect(toList());
	}
	
	public static long countDistinctStudentActivities(){
		return StudentDataBase.getAllStudents().stream(). //Stream<Student>
				map(Student :: getActivities). //Stream<List<String>>
				flatMap(List :: stream). //Stream<String>
				distinct().
				count();
	}
	
	public static List<String> sortDistinctStudentActivities(){
		return StudentDataBase.getAllStudents().stream(). //Stream<Student>
				map(Student :: getActivities). //Stream<List<String>>
				flatMap(List :: stream). //Stream<String>
				distinct().
				sorted().collect(toList());
	}
	
	public static void main(String[] args) {

		System.out.println(printDistinctStudentActivities());
		System.out.println(countDistinctStudentActivities());
		System.out.println(sortDistinctStudentActivities());
	}

}
