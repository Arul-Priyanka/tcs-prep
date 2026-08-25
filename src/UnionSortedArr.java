import java.util.ArrayList;
import java.util.Arrays;

//Union of 2 Sorted Arrays
//Approach: Two Pointers (Merge Step)
 //Time Complexity: $O(N + M)$ — Linear scan through both arrays.
// Space Complexity: $O(1)$ — Excluding the space used to store the output list.
public class UnionSortedArr {
    public static ArrayList<Integer> findUnion(int[] a, int[] b){
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        int n = a.length , m = b.length;

        while(i<n && j < m){
            int val;
            if(a[i] < b[j]){
                //if element in a is less than element in b
                val = a[i++];
            } else if (a[i] > b[j]) {
                //if element in b is less than element in a
                val = b[j++];
            }
            else{
                //if element in a is equal to element in b
                val = a[i];
                i++;
                j++;
            }

            if(result.isEmpty() || result.get(result.size() - 1) != val){
                result.add(val);
                //to prevent duplicates
            }
        }
        while(i < n){
            if(result.isEmpty() || result.get(result.size() - 1) != a[i]){
                result.add(a[i]);
            }
            i++;
        }

        while(j < m){
            if(result.isEmpty() || result.get(result.size() - 1) != b[j]){
                result.add(b[j]);
            }
            j++;
        }
        return result;
     }

    public static void main(String[] args) {

    }
}
