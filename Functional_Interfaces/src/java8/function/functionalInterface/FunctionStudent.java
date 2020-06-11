package java8.function.functionalInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import java8.consumer.functionalInterface.Student;
import java8.consumer.functionalInterface.StudentDataBase;
import java8.predicate.functionalInterface.PredicateStudent;

public class FunctionStudent {
	
	static List<Student> studList = StudentDataBase.getAllStudents();
	
	static Function<List<Student> , Map<String,Double>> f1 = (students -> {
		Map<String,Double> s = new HashMap<String, Double>();
		students.forEach(student -> {
			if(PredicateStudent.p.test(student)){
				s.put(student.getName(), student.getGpa());
			}
		});
		return s;
	});
	
	public static void main(String[] args) {
		
		System.out.println(f1.apply(studList));
	}

}
