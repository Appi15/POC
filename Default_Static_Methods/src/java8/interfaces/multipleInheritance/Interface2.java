package java8.interfaces.multipleInheritance;

public interface Interface2 extends Interface1{
	
	default void methodB(){
		System.out.println("Interface2 :- Method B");
	}
	
	default void methodA(){
		System.out.println("Interface2 :- Method A");
	}
}
