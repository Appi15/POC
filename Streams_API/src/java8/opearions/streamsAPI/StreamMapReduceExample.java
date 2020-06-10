package java8.opearions.streamsAPI;

import java8.basic.streamsAPI.Student;
import java8.basic.streamsAPI.StudentDataBase;

public class StreamMapReduceExample {
	
	private static int noOfNotebooks(){
		return StudentDataBase.getAllStudents().stream(). //Stream<Student>
				map(Student::getNoteBooks).  //Stream<Integer>
				reduce(0, (a,b)->a+b);
	}
	
	private static int noOfBooks(){
		return StudentDataBase.getAllStudents().stream(). //Stream<Student>
				map(Student::getNoteBooks).  //Stream<Integer>
				reduce(0, Integer::sum);
	}
	
	private static int noOfNotebooksWithGradeFilter(){
		return StudentDataBase.getAllStudents().stream(). //Stream<Student>
				filter(s-> s.getGradeLevel()>=3).	//Stream<Student> with grade>=3
				map(Student::getNoteBooks).  //Stream<Integer>
				reduce(0, (a,b)->a+b);
	}
	public static void main(String[] args) {
		
		System.out.println(noOfNotebooks());		
		System.out.println(noOfBooks());
		System.out.println(noOfNotebooksWithGradeFilter());
	}

}
