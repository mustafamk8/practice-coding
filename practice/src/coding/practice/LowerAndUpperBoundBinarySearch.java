package coding.practice;

import java.util.Scanner;

public class LowerAndUpperBoundBinarySearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array : ");
		int n = sc.nextInt();
		
		int[] arr = new int [n];
		System.out.println("enter "+n+" value in array : ");
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int low =0, high = n-1;
		System.out.println("enter target value to find : ");
		int target = sc.nextInt();
		
		LowerAndUpperBoundBinarySearch ls = new LowerAndUpperBoundBinarySearch();
		
		int result = ls.searchLowerBound(arr,low,high,target);
		
		System.out.println("result at index by using recursive method : "+result);
		
		int rs = ls.searchUpperBound(arr,low,high,target);
		
		System.out.println("result at index by using recursive method : "+rs);
		
		
	}

	public int searchLowerBound(int[] arr, int low, int high, int target) {
		int ans = arr.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			
			if(arr[mid]>=target) {
				ans = mid;
				high = mid-1;
			}
			else low = mid+1;
			
		}
		
			return ans;
	}
	
	public int searchUpperBound(int[] arr, int low, int high, int target) {
		int ans = arr.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			
			if(arr[mid]>target) {
				ans = mid;
				high = mid-1;
			}
			else low = mid+1;
			
		}
		
			return ans;
	}
	
	
}
