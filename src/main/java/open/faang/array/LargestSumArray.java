package open.faang.array;

/**
 * Input:
 * N = 5
 * Arr[] = {1,2,3,-2,5}
 * Output:
 * 9
 * Explanation:
 * Max subarray sum is 9
 * of elements (1, 2, 3, -2, 5) which
 * is a contiguous subarray.
 * */

//Kadane's Algorithm
public class LargestSumArray {
    public static void main(String[] args) {
        int[] arr = {-1,-2,-3,-4};
        int maxSum = Integer.MIN_VALUE;
        int sum = Integer.MIN_VALUE;

        for(int i = 0;i<=arr.length-1;i++){
            if(sum<0) {
                sum = arr[i];
            } else {
                sum += arr[i];
            }
            maxSum = max(sum,maxSum);
        }
        System.out.println(maxSum);
    }

    public static int max(int a, int b) {
        return (a >= b) ? a : b;
    }
}
