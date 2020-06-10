package java8.opearions.streamsAPI;

import java.util.Optional;

import java8.basic.streamsAPI.Student;
import java8.basic.streamsAPI.StudentDataBase;

public class StreamsReduceStudentExample {
	
	public static Optional<Student> getHighestGPAStudent(){
		return StudentDataBase.getAllStudents().stream(). //Stream<Student>
			reduce((s1,s2) -> (s1.getGpa()>s2.getGpa() ? s1 :s2));
	}
	
	public static void main(String[] args) {
		
		Optional<Student> result = getHighestGPAStudent();
		if(result.isPresent()){
			System.out.println(result.get());
		}
	}

}
