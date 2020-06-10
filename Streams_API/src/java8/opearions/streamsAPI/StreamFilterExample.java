package java8.opearions.streamsAPI;

import java.util.List;

import java8.basic.streamsAPI.Student;
import java8.basic.streamsAPI.StudentDataBase;
import static java.util.stream.Collectors.toList;

public class StreamFilterExample {
	
	public static List<Student> filterStudents(){
		return StudentDataBase.getAllStudents().stream(). //Stream<Student>
				filter((s) -> s.getGender().equals("female")). //Stream<Student> only female
				collect(toList());
	}
	
	public static List<Student> filterChaining(){
		return StudentDataBase.getAllStudents().stream(). //Stream<Student>
				filter((s) -> s.getGender().equals("female")). //Stream<Student> only female
				filter((s1) -> s1.getGpa()>=3.9).
				collect(toList());
	}
	
	public static void main(String[] args) {
		
		filterStudents().forEach(System.out :: println);
		filterChaining().forEach(System.out :: println);
	}

}
