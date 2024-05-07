package coding.practice.Array;

import java.util.Scanner;

public class ShiftZero {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] moveZeros(int n, int[] arr) {

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                int j = i + 1;
                while (j < n && arr[j] == 0) {
                    j++;
                }
                if (j < n) {
                    swap(arr, i, j);
                }
            }
        }

        return arr;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter elements of array ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int[] a = moveZeros(n, arr);
        System.out.println("After Shifting ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
