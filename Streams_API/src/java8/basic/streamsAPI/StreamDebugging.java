package java8.basic.streamsAPI;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamDebugging {

	public static void main(String[] args) {
		
		Predicate<Student> p = (s -> s.getGradeLevel()>=3);
		Predicate<Student> p1 = (s -> s.getGpa()>=3.9);
	
		Map<String,List<String>> m2 = StudentDataBase.getAllStudents().stream().
				peek(stud -> {
					System.out.println(stud);
				}).
				filter(p).
				peek(stud -> {
					System.out.println("After first filter :- " + stud);
				}).filter(p1).
				peek(stud -> {
					System.out.println("After second filter :- " + stud);
				}).
				collect(Collectors.toMap(Student::getName, Student::getActivities));
	}

}
