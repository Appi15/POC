package java8.function.functionalInterface;

public class FunctionExample {
	
	public static String performConcat (String str){
		return FunctionDemo.f2.apply(str);
	}
	
	public static void main(String[] args) {
		
		String result = performConcat("Hello");
		System.out.println("Result is " + result);
	}

}
