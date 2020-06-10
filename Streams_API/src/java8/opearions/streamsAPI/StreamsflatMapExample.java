package java8.opearions.streamsAPI;

import java.util.List;
import static java.util.stream.Collectors.toList;

import java8.basic.streamsAPI.Student;
import java8.basic.streamsAPI.StudentDataBase;

public class StreamsflatMapExample {
	
	public static List<String> printStudentActivities(){
		return StudentDataBase.getAllStudents().stream(). //Stream<Student>
				map(Student :: getActivities). //Stream<List<String>>
				flatMap(List :: stream). //Stream<String>
				collect(toList());
	}
	
	public static void main(String[] args) {
	
		System.out.println(printStudentActivities());
	}

}
