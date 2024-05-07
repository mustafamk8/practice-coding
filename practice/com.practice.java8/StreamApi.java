package coding.practice.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

	
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		for(int i =1;i<=10;i++) {
			l.add(i);
		}
		
		List<Integer> list = l.stream().filter(a->a%2==0).collect(Collectors.toList());
		
		System.out.print("even numbers are : ");
		for(int num : list) {
			System.out.print(num+" ");
		}
		
	}
}
