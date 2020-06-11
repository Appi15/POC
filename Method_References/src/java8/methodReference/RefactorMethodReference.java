package java8.methodReference;

import java.util.function.Predicate;

public class RefactorMethodReference {
	
	static Predicate<Student> p1 = (s) -> s.getGradeLevel() >=3;
	
	static Predicate<Student> p2 = RefactorMethodReference :: greaterThanGradeLevel;
	
	static public boolean greaterThanGradeLevel (Student s){
		return s.getGradeLevel() >=3;
	}
	
	public static void main(String[] args) {
		
		//System.out.println(p1.test(StudentDataBase.studSupplier .get()));
		System.out.println(p2.test(StudentDataBase.studSupplier .get()));
	}
	

}

