package java8.biconsumer.functionalInterface;

import java.util.List;
import java.util.function.BiConsumer;

import java8.consumer.functionalInterface.Student;
import java8.consumer.functionalInterface.StudentDataBase;

public class BiConsumerStudent {
	
	public static void nameAndActivities(){
		BiConsumer<String,List<String>> biConsumer = (name,activieis)-> {
			System.out.println(name + " : " + activieis);
		};
		List<Student> s = StudentDataBase.getAllStudents();
		
		s.forEach(stud -> biConsumer.accept(stud.getName(),	stud.getActivities()));
	}
	
	
	public static void main(String[] args) {
		
		nameAndActivities();
	}

}
