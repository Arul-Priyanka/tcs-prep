//Check sorted
//Approach: Single Pass Adjacent Comparison
//Time Complexity: $O(N)$ — Single pass through the array.
// Space Complexity: $O(1)$ — Constant auxiliary space.
public class CheckSorted {
 public static boolean issorted(int[] arr){
     for(int i = 1; i < arr.length ;i++){
         if(arr[i] < arr[i-1]){
             return false;
         }
     }
     return true;
 }

    public static void main(String[] args) {
        int[] evenNo = {2,4,6,8};
        boolean sortedAh = issorted(evenNo);
        System.out.printf("%b",sortedAh);
    }
}
