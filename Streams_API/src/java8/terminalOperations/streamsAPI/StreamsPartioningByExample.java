package java8.terminalOperations.streamsAPI;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import java8.basic.streamsAPI.Student;
import java8.basic.streamsAPI.StudentDataBase;

public class StreamsPartioningByExample {
	
	public static void partioningBy(){
		
		Predicate<Student> gpaPredicate = s -> s.getGpa()>=3.9;
		Map<Boolean,List<Student>> m =StudentDataBase.getAllStudents().stream().
									collect(Collectors.partitioningBy(gpaPredicate));
		System.out.println(m);
	}
	
	public static void partioningBy1(){
		
		Predicate<Student> gpaPredicate = s -> s.getGpa()>=3.9;
		Map<Boolean,Set<Student>> m =StudentDataBase.getAllStudents().stream().
									collect(Collectors.partitioningBy(gpaPredicate,Collectors.toSet()));
		System.out.println(m);
	}
	
	public static void main(String[] args) {
		
		partioningBy();
		partioningBy1();
	}

}
