//Largest In Array
// Approach: Linear Scan
//Time Complexity: $O(N)$ — Single pass through the array.
//Space Complexity: $O(1)$ — Uses no extra space.

public class LargestInArray {
    public static int largestNo(int[] arr){
        int max = arr[0];
        for( int i = 0; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] markSheet = {7,8,7,9};
        int maximum = largestNo(markSheet);
        System.out.printf("%d",maximum);
    }
}
