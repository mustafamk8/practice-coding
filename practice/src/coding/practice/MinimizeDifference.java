package coding.practice;
import java.util.Arrays;

public class MinimizeDifference {
    public static void main(String[] args) {
        int[] A = {6, 2, 3, 4};
        int N = A.length;
        
        rearrangeArray(A, N);
        
        System.out.println("Rearranged Array: " + Arrays.toString(A));
    }

    public static void rearrangeArray(int[] A, int N) {
        // Sort the array in non-decreasing order
        Arrays.sort(A);

        // Initialize sums
        int sumEven = 0;
        int sumOdd = 0;

        // Rearrange the array to minimize the absolute difference
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                sumEven += A[i];
            } else {
                sumOdd += A[i];
            }
        }

        // Calculate the absolute difference
        int diff = Math.abs(sumEven - sumOdd);

        // If the difference is minimized, the array is already rearranged optimally
        if (diff <= 1) {
            return;
        }

        // Otherwise, rearrange the array to minimize the difference
        for (int i = 0; i < N / 2; i++) {
            int temp = A[i];
            A[i] = A[N - i - 1];
            A[N - i - 1] = temp;
        }
    }
}

