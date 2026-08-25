//Max Consecutive Bit
//Approach: Single Pass Counter
//Time Complexity: $O(N)$ — Single pass through the array.
// Space Complexity: $O(1)$ — Uses constant extra space.
public class MaxConsecutiveBit {
    public static int maxConsective(int[] arr) {
        int maxcount = 1, count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            maxcount = Math.max(count, maxcount);

        }
        return maxcount;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 1, 1};
        int maxcnt = maxConsective(arr);
        System.out.printf("%d",maxcnt);
    }
}