package java8.terminalOperations.streamsAPI;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import java8.basic.streamsAPI.Student;
import java8.basic.streamsAPI.StudentDataBase;

public class StreamsGroupingByExample {
	
	public static void groupByGender(){
		Map<String,List<Student>> m = StudentDataBase.getAllStudents().stream().
										collect(Collectors.groupingBy(Student::getGender));
		System.out.println(m);
	}
	
	public static void customizedGroupBy(){
		Map<String,List<Student>> m = StudentDataBase.getAllStudents().stream().
										collect(Collectors.groupingBy(s -> s.getGpa()>=3.9 ? "OUTSTANDING" : "AVERAGE"));
		System.out.println(m);
	}
	
	public static void main(String[] args) {
		
		groupByGender();
		customizedGroupBy();
	}

}
