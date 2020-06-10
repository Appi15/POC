package java8.basic.streamsAPI;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.omg.Messaging.SyncScopeHelper;

public class Collections_Streams_Demo {

	public static void main(String[] args) {
		
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Jim");
		names.add("Jenny");
		names.add("John");
		
		for(String n:names){
			System.out.println(n);
		}
		names.remove(0);
		System.out.println(names);
		
		Stream<String> nameStream = names.stream();
		nameStream.forEach(System.out::println);
		nameStream.forEach(System.out::println);

	}

}
