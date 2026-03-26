package java_interview_problems;

/**
 * The Largest Sum Subarray problem is one of the most important interview questions and is solved using Kadane’s Algorithm.
 * Kadane’s Algorithm is a dynamic programming technique used to find the maximum sum of a contiguous subarray in an array,
 * running in linear time O(n) with constant space O(1). It’s widely applied in problems like stock profit analysis, signal processing,
 * and competitive programming.
 */
public class LargestSumSubArray {
    public static void main(String[] args) {
        int[] input = {-3,3,-4,1,-2,4,-1,2};
        int maxSum = input[0];
        int currentSum = input[0];

        for (int i = 1; i < input.length; i++) {
            //for each iteration get the max current value out of input value and existing value with addition of input value
            currentSum = Math.max(input[i], currentSum + input[i]);
            //get the maximum sum value
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println("Maximum SubArray sum: "+maxSum);
    }
}
