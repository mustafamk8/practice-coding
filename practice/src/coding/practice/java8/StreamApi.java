package coding.practice.java8;

import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

public static void main(String[] args) {
		
		
		List<String> list1=List.of("Sneha","Ankit","Sakshi","Siddharth"); //
		List<String> names= list1.stream().filter(e->e.startsWith("S")).collect(Collectors.toList());
		System.out.println(names);
		
		



	}
	
}
