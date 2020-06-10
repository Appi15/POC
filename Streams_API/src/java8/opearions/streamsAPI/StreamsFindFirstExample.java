package java8.opearions.streamsAPI;

import java.util.Optional;

import java8.basic.streamsAPI.Student;
import java8.basic.streamsAPI.StudentDataBase;

public class StreamsFindFirstExample {
	
	public static Optional<Student> findFirstStudent(){
		return StudentDataBase.getAllStudents().stream().
				filter(s-> s.getGpa()>=4.3).
				findFirst();
	}
	
	public static void main(String[] args) {
		
		Optional<Student> result = findFirstStudent();
		if(result.isPresent()){
			System.out.println("Student information is :- " + result.get());
		}
		else{
			System.out.println("Student not found");
		}
	}

}
