package java8.opearions.streamsAPI;

import java8.basic.streamsAPI.StudentDataBase;

public class StreamsMatchExample {
	
	public static boolean allMatch(){
		return StudentDataBase.getAllStudents().stream().
				allMatch(s -> s.getGpa()>=3.5);
	}
	
	public static boolean anyMatch(){
		return StudentDataBase.getAllStudents().stream().
				anyMatch(s -> s.getGpa()>=4.2);	
	}
	
	public static boolean noneMatch(){
		return StudentDataBase.getAllStudents().stream().
				noneMatch(s -> s.getGpa()>=4.1);	
	}
	
	public static void main(String[] args) {
		
		System.out.println("Result of all match is :- " + allMatch());		
		System.out.println("Result of any match is :- " + anyMatch());
		System.out.println("Result of none match is :- " + noneMatch());
	}

}
