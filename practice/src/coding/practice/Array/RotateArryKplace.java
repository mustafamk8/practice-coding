package coding.practice.Array;

import java.util.Scanner;

public class RotateArryKplace {

	
	public static void main(String[] args) {
		Scanner sc  = new  Scanner(System.in);
		System.out.println("enter size of array ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter elements of array ");
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
			
		int k = sc.nextInt();
		rotateArray(arr,k);
		System.out.println("After Rotation array ");
		for(int i =0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	private static void rotateArray(int[] arr, int k) {
		
		int n = arr.length;
		k = k%n;
		int[] ans = new int[n];
		int l = 0;
		for(int i = k;i<n;i++) {
			ans[l]=arr[i];
			l++;
		}
		for(int i = 0;i<k;i++) {
			ans[l]=arr[i];
			l++;
		}
		for(int i = 0;i<n;i++) {
			arr[i] = ans[i];
		}
		
	}
	
}
