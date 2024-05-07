package coding.practice.Array;

import java.util.HashMap;
import java.util.Scanner;


public class TwoSum {

	
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter size of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter elements of array");
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter size of array");
		int target = sc.nextInt();
		String ans = checkSum(arr,n,target);
		System.out.println("answer : "+ans);
		
	}
	private static String checkSum(int[] arr, int n, int target) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0;i<n;i++) {
			int num = arr[i];
			int more = target - num;
			if(map.containsKey(more)) {
				return "Yes";
			}else {
				map.put(arr[i],i);
			}
		}
		
		return "No";
	}
	
	
}
