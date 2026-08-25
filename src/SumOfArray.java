
//sum of array
//Approach: Iterative Summation
//Time Complexity: $O(N)$ — Single pass through array of length $N$.
// Space Complexity: $O(1)$ — Constant extra space.

public class SumOfArray {
    public static void main(String[] args) {
        int[] markSheet = {80,90,99,97,89};
        int marks = sum(markSheet);
        System.out.printf("%d",marks);
    }
    public static int sum(int[] arr){
        int total = 0;
        for (int num : arr){
            total+= num;
        }
        return total;
    }
}

