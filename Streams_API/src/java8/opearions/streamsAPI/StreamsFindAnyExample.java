package java8.opearions.streamsAPI;

import java.util.Optional;

import java8.basic.streamsAPI.Student;
import java8.basic.streamsAPI.StudentDataBase;

public class StreamsFindAnyExample {
	
	public static Optional<Student> findAnyStudent(){
		return StudentDataBase.getAllStudents().stream().
				filter(s-> s.getGpa()>=3.9).
				findAny();
	}
	
	public static void main(String[] args) {
		
		Optional<Student> result = findAnyStudent();
		if(result.isPresent()){
			System.out.println("Student information is :- " + result.get());
		}
		else{
			System.out.println("Student not found");
		}

	}

}
