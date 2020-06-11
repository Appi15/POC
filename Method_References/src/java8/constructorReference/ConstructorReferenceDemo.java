package java8.constructorReference;

import java.util.function.Function;
import java.util.function.Supplier;

import java8.methodReference.Student;

public class ConstructorReferenceDemo {
	
	static Supplier<Student> studSupplier = Student :: new;
	
	static Function<String,Student> f = Student :: new;
	
	public static void main(String[] args) {
		
		System.out.println(studSupplier.get());
		System.out.println(f.apply("Apeksha"));
	}

}

