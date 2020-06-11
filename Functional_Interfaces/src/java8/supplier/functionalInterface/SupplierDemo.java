package java8.supplier.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import java8.consumer.functionalInterface.Student;
import java8.consumer.functionalInterface.StudentDataBase;

public class SupplierDemo {
	
	static Supplier<Student> stud = () -> {
		return new Student("Apeksha",2,3.6, "female",Arrays.asList("reading", "music","volleyball"));
	};
	
	static Supplier<List<Student>> studList = () -> {
		return StudentDataBase.getAllStudents();
	};
	
 	public static void main(String[] args) {
		
		System.out.println(stud.get());
		System.out.println(studList.get());
		
	}

}
