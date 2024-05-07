package coding.practice;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateNumber {

	
	public static int findSingleCount(int arr[],int n) {
		
		Stack<Integer> st = new Stack<Integer>();
		st.push(arr[0]);
		for(int i =1;i<n;i++) {
			
			if(st.peek()==arr[i-1]) {
				st.pop();
			}else {
				st.push(arr[i]);
			}
				
		}
		if(st.empty())
			st.push(55);
		for(int i : st) {
			System.out.println(st.peek());
			st.pop();
			}
		return 0;
//		int ans = st.peek();
//		return ans;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int ans = findSingleCount(arr,n);
		System.out.println(ans);
		
	}
	
}
