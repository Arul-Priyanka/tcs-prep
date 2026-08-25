//Reverse an Array
//Approach: Two Pointers (In-Place Swap)
//Time Complexity: $O(N)$ — Swaps elements in $N/2$ iterations.
// Space Complexity: $O(1)$ — Modifies the array in-place.
import java.util.ArrayList;
import java.util.Arrays;
public class ReverseArray {
    public static void reverse(int[] arr){
        int left  = 0,right = arr.length - 1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] myList = {1,2,3,5};
        System.out.printf("%s", Arrays.toString(myList));
        reverse(myList);
        System.out.printf("%s", Arrays.toString(myList));

    }
}
