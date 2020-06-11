package java8.bifunction.functionalInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import java8.consumer.functionalInterface.Student;
import java8.consumer.functionalInterface.StudentDataBase;
import java8.predicate.functionalInterface.PredicateStudent;

public class BiFunctionStudent {
	
	static BiFunction<List<Student>,Predicate<Student>,Map<String,Double>> f1 = (studList,p) -> {
		Map<String,Double> m = new HashMap<>();
		studList.forEach(s -> {
			if(p.test(s)){
				m.put(s.getName(), s.getGpa());
			}
		});
		return m;
	};
	
	public static void main(String[] args) {
		
		System.out.println(f1.apply(StudentDataBase.getAllStudents(), PredicateStudent.p));
	}

}
