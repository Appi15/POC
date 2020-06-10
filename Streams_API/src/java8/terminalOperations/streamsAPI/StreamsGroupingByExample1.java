package java8.terminalOperations.streamsAPI;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import java8.basic.streamsAPI.Student;
import java8.basic.streamsAPI.StudentDataBase;

public class StreamsGroupingByExample1 {
	
	public static void groupBy(){
		Map<Integer,Map<String,List<Student>>> m = StudentDataBase.getAllStudents().stream().
			collect(Collectors.groupingBy(Student:: getGradeLevel, 
					Collectors.groupingBy(s -> s.getGpa()>=3.9 ? "OUTSTANDING" : "AVERAGE")));
		System.out.println(m);
	}
	
	public static void groupBy1(){
		Map<Integer,Integer> m = StudentDataBase.getAllStudents().stream().
			collect(Collectors.groupingBy(Student:: getGradeLevel, 
					Collectors.summingInt(Student :: getNoteBooks)));
		System.out.println(m);
	}
	
	public static void main(String[] args) {
		
		groupBy();
		groupBy1();
	}

}
