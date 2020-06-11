package java8.interfaces.defaultMethods;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodExample2 {
	
	static Consumer<Student> studConsumer = (s -> System.out.println(s));
	static Comparator<Student> nameComparator = Comparator.comparing(Student :: getName);
	static Comparator<Student> gradeComparator = Comparator.comparing(Student :: getGradeLevel);
	
	public static void sortByName(List<Student> list){
		System.out.println("After sorting by name :- ");
		Comparator<Student> nameComparator = Comparator.comparing(Student :: getName);
		list.sort(nameComparator);
		list.forEach(studConsumer);
	}
	
	public static void sortByGPA(List<Student> list){
		System.out.println("After sorting by GPA :- ");
		Comparator<Student> nameComparator = Comparator.comparingDouble(Student :: getGpa);
		list.sort(nameComparator);
		list.forEach(studConsumer);
	}
	
	public static void comparatorChaining(List<Student> list){
		System.out.println("After compartor chaining :- ");
		list.sort(gradeComparator.thenComparing(nameComparator));
		list.forEach(studConsumer);
	}
	
	public static void sortWithNullValues(List<Student> list){
		System.out.println("After sort with null values :- ");
		Comparator<Student> studComp = Comparator.nullsFirst(nameComparator);
		list.sort(studComp);
		list.forEach(studConsumer);
	}
	
	public static void main(String[] args) {
		
		List<Student> studList = StudentDataBase.getAllStudents();
		System.out.println("Before sorting :- ");
		studList.forEach(studConsumer);
		
		//sortByName(studList);
		//sortByGPA(studList);
		//comparatorChaining(studList);
		sortWithNullValues(studList);
	}

}
