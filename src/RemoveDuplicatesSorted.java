//Remove Duplicates Sorted Array
//Approach: Two-Pointer / Unique Index Tracking
//Time Complexity: $O(N)$ — Single pass to identify unique elements.
// Space Complexity: $O(K)$ — Creates a result array of size $K$
// (where $K$ is the number of distinct elements).
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesSorted {
    public static int[] removeDupes(int[] arr){
        int idx = 0;
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[idx] != arr[i]){
                idx ++;
                arr[idx] = arr[i];
            }
        }
        return Arrays.copyOf(arr, idx + 1);

    }


    public static void main(String[] args) {
        int[] myList = {1,2,2,2,3,3,5,5};
        int[] newlist = removeDupes(myList);
        System.out.printf("%s", Arrays.toString(newlist));
        Set<Integer> s = new TreeSet<>();
        for (int i = 0; i < myList.length; i++) {
            s.add(myList[i]);
        }
        for(int num : s){
            System.out.print(num+" ");
        }
    }

}

