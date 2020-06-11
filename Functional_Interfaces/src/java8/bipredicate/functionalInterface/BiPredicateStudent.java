package java8.bipredicate.functionalInterface;

import java.util.List;
import java.util.function.BiPredicate;

import java8.consumer.functionalInterface.Student;
import java8.consumer.functionalInterface.StudentDataBase;

public class BiPredicateStudent {
	
	static BiPredicate<Integer , Double> b = (gradeLev , gpa)-> gradeLev >=3 && gpa >= 3.9;
	static List<Student> stud = StudentDataBase.getAllStudents();
	
	public static void printNameAndActivities(List<Student> stud){
		stud.forEach(s -> {
			if(b.test(s.getGradeLevel(),s.getGpa())){
				System.out.println(s);
			}
		});
	}
	
	public static void main(String[] args) {
		
		printNameAndActivities(stud);
	}

}
