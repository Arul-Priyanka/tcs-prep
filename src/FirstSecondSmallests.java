import java.util.Arrays;

//First and Second Smallests
//Approach: Single Pass Scan
//Time Complexity: $O(N)$ — Single traversal.
// Space Complexity: $O(1)$ — Auxiliary space is constant./
public class FirstSecondSmallests {
public static int[] minAnd2ndMin(int[] arr){
    int first = Integer.MAX_VALUE;
    int second = Integer.MAX_VALUE;

    for(int num :arr){
        if(num < first){
            second = first;
            first = num;
        } else if (num > first && num < second) {
            second = num;
        }
        }
    if(second == Integer.MAX_VALUE){
        return new int[]{-1};
    }
    return new int[]{first,second};
}

    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 6};
        int[] output = minAnd2ndMin(arr);
        System.out.printf("%s", Arrays.toString(output));

    }
}
