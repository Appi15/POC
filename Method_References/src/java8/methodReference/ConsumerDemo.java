package java8.methodReference;

import java.util.function.Consumer;

public class ConsumerDemo {
	
	static Consumer<Student> c = s -> System.out.println(s);
	
	static Consumer<Student> c1 = System .out::println;
	
	static Consumer<Student> c2 = Student :: printListOfActivities;
	
	public static void main(String[] args) {
		
		//StudentDataBase.getAllStudents().forEach(c);
		//StudentDataBase.getAllStudents().forEach(c1);
		StudentDataBase.getAllStudents().forEach(c2);
	}

}

