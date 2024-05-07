package coding.practice;

import java.util.Scanner;

public class BinarySearch {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("enter size of array : ");
		int[] arr = new int [n];
		System.out.println("enter "+n+" value in array : ");
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int low =0, high = n-1;
		System.out.println("enter target value to find : ");
		int target = sc.nextInt();
		
		BinarySearch bs = new BinarySearch();
		
		System.out.println("By using recursive method : ");
		
		int result = bs.findIndex(arr,low,high,target);
		System.out.println("result at index by using recursive method : "+result);
		
		System.out.println("By using loop method : ");
		int rs = bs.findIndexByLoop(arr,target);
		System.out.println("result at index by using loop method : "+rs);
		
	}

	public int findIndexByLoop(int[] arr, int target) {
		int n = arr.length;
		int low = 0, high = n-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			
			if(arr[mid]==target) return mid;
			else if(arr[mid]>target) high = mid-1;
			else return low = mid+1;
		}
		
		return -1;
	}

	public int findIndex(int[] arr, int low, int high, int target) {
		
		if(low>high) return -1;
		
		int mid = (low+high)/2;
		
		if(arr[mid]==target) return mid;
		else if(arr[mid]>target) return findIndex(arr,low,mid-1,target);
		else if(arr[mid]<target) return findIndex(arr,mid+1,high,target);
		
		return -1;
	}
	
}
