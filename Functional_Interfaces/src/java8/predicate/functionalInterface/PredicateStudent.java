package java8.predicate.functionalInterface;

import java.util.List;
import java.util.function.Predicate;

import java8.consumer.functionalInterface.Student;
import java8.consumer.functionalInterface.StudentDataBase;

public class PredicateStudent {
	
	public static Predicate<Student> p = (s) -> s.getGradeLevel()>=3;
	static Predicate<Student> p1 = (s) -> s.getGpa()>=3.9;
	static List<Student> stud = StudentDataBase.getAllStudents();
	
	public static void filterStudentByGrad(){
		stud.forEach(s1 ->{
			if(p.test(s1)){
				System.out.println(s1);
			}
		});
	}
	
	public static void filterStudentByGPA(){
		stud.forEach(s2 -> {
			if(p1.test(s2)){
				System.out.println(s2);
			}
		});
	}
	
	public static void filterStudents(){
		stud.forEach(s3 -> {
			if(p1.or(p).test(s3)){
				System.out.println(s3);
			}
		});
	}
	
	public static void main(String[] args) {
		
		//filterStudentByGrad();
		//filterStudentByGPA();
		filterStudents();
	}

}
