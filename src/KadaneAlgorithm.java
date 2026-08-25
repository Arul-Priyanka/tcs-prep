public class KadaneAlgorithm {
    public static long maxSubarraySum(int[] arr){
        long currentStreak = 0;
        long bestSum = Long.MIN_VALUE;
        for(int num : arr){
            currentStreak = Math.max((long) num, currentStreak + num);
            bestSum = Math.max(bestSum,currentStreak);

        }
        return bestSum;
    }
    public static void main(String[] args) {
// Test case from your examples
        int[] arr1 = {2, 3, -8, 7, -1, 2, 3};
        System.out.println("Max Sum: " + maxSubarraySum(arr1)); // Outputs 11

        // Test case with all negative numbers
        int[] arr2 = {-2, -4};
        System.out.println("Max Sum: " + maxSubarraySum(arr2)); // Outputs -2

    }
}
