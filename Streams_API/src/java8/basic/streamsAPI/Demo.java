package java8.basic.streamsAPI;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		
		Predicate<Student> p = (s -> s.getGradeLevel()>=3);
		Predicate<Student> p1 = (s -> s.getGpa()>=3.9);
		
		Map<String,List<String>> m = StudentDataBase.getAllStudents().stream().
			collect(Collectors.toMap(Student::getName, Student::getActivities));
		
		Map<String,List<String>> m1 = StudentDataBase.getAllStudents().stream().
				filter(p).collect(Collectors.toMap(Student::getName, Student::getActivities));
		
		Map<String,List<String>> m2 = StudentDataBase.getAllStudents().stream().
				filter(p).filter(p1).collect(Collectors.toMap(Student::getName, Student::getActivities));
		
		//System.out.println(m);
		//System.out.println(m1);
		System.out.println(m2);
	}

}
