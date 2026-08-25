//Mean or Average of an Array
//Approach: Iterative Summation with Integer Division
//Time Complexity: $O(N)$ — Traverses the array once.
//Space Complexity: $O(1)$ — Auxillary space is constant

public class MeanOfArray {
    public static int mean(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum/arr.length;
    }

    public static void main(String[] args) {
        int[] markSheet = {80,90,99,97,89};
        int score = mean(markSheet);
        System.out.printf("%d",score);
    }
}

