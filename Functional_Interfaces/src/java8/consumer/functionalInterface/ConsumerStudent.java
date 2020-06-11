package java8.consumer.functionalInterface;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerStudent {
	
	static Consumer<Student> c = (s) -> {System.out.println(s);};
	static Consumer<Student> c1 = (s) -> {System.out.print(s.getName());};
	static Consumer<Student> c2 = (s) -> {System.out.println(s.getActivities());};
	
	public static void printName(){
		List<Student> studList = StudentDataBase.getAllStudents();
		studList.forEach(c);
	}
	
	public static void PrintNameAndActivities(){
		List<Student> studList = StudentDataBase.getAllStudents();
		studList.forEach(c1.andThen(c2)); //ConsumerChaining
	}
	
	public static void PrintNameAndActivitiesUsingCondition(){	
		List<Student> studList = StudentDataBase.getAllStudents();
		studList.forEach((s -> {
				if(s.getGradeLevel()>=3 && s.getGpa()>=3.9){
					c1.andThen(c2).accept(s);
				}
			}
		)); 
	}
	
	public static void main(String[] args) {
		//printName();
		//PrintNameAndActivities();
		PrintNameAndActivitiesUsingCondition();
	}

}
