//Second Largest
//Approach: Single Pass Scan
 //Time Complexity: $O(N)$ — Single traversal.
// Space Complexity: $O(1)$ — No extra space used.
public class SecondLargest {
    public static int secondmax(int[] arr){
        int largest = -1;
        int secondlargest = -1;
        for( int i = 0; i < arr.length ; i++){
            if(arr[i] > largest){
                secondlargest = largest;
                largest = arr[i];
            }
        }
        return secondlargest;
    }

    public static void main(String[] args) {
        int[] markSheet = {7,8,7,9};
        int maxsecond = secondmax(markSheet);
        System.out.printf("%d",maxsecond);
    }
}
