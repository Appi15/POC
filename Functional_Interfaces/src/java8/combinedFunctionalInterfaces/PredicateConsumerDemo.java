package java8.combinedFunctionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import java8.consumer.functionalInterface.Student;
import java8.consumer.functionalInterface.StudentDataBase;

public class PredicateConsumerDemo {
	
	Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
	Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;
	
	BiConsumer<String,List<String>> b = (name,activities) -> System.out.println(name + " : " + activities);
	
	Consumer<Student> c = (s -> {
		if(p1.and(p2).test(s)){
			b.accept(s.getName(), s.getActivities());
		}
	});
	
	public void printNameAndActivities(List<Student> students){
		students.forEach(c);
	}
	
	public static void main(String[] args) {
		
		List<Student> stud = StudentDataBase.getAllStudents();
		new PredicateConsumerDemo().printNameAndActivities(stud);
	}

}
